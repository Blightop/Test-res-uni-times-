
public class FlagThreadApp {
    public static void main(String[] args) {
        System.err.println("Main thread started.");
        FlagExample threadA = new FlagExample();
        threadA.setName("Thread-A"); // Set thread name
        FlagExample threadB = new FlagExample();
        threadB.setName("Thread-B"); // Set thread name

        threadA.start(); // Start the thread
        threadB.start(); // Start the thread

        try {
            System.out.println("\nMain thread is sleeping for 2 seconds...\n");
            Thread.sleep(1000); // Let the thread run for 2 seconds
            System.out.println("\nMain thread woke up, signaling threads to stop...\n");
            threadA.stopThread(); // Signal threadA to stop
            threadB.stopThread(); // Signal threadB to stop

            threadA.join(); // Wait for threadA to finish
            threadB.join(); // Wait for threadB to finish
            //it calls join because we want to make sure that the main thread 
            //waits for these threads to finish before it continues.
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        System.err.println("Main thread finished.");
    }
}
