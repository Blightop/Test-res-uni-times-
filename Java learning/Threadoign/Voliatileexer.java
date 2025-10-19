public class Voliatileexer {
    private static volatile boolean Running = true;
    
    public static class StoppableTask implements Runnable {
        @Override
        public void run() {
            int counter = 0;
            while (Running) {
                counter++;
            }
            System.out.println(Thread.currentThread().getName() + " stopped at count: " + counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread taskThread = new Thread(new StoppableTask(), "StoppableTask-Thread");
        taskThread.start();
        
        Thread.sleep(1000); // Let the thread run for 1 second
        Running = false; // Signal the thread to stop
        
        taskThread.join(); // Wait for the thread to finish
        System.out.println("Main thread finished.");
    }
}
