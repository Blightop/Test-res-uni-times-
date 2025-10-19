public class InterruptionExample implements Runnable{
        @Override
        public void run() {

            int counter = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " is running, Count: " + counter++);
                    Thread.sleep(50); // Simulate work
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted during run.");
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            System.out.println("Thread is stopping...");
        }

        System.out.println(Thread.currentThread().getName() + " has stopped.");
}
