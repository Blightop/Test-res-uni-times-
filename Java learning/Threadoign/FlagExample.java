public class FlagExample extends Thread{
    //extend thread class to create a thread by inheritance

    private volatile boolean done = false; // volatile ensures visibility across threads
    //use done variable to control the while loop in run method
    // run() method contains the code that will be executed by the thread
    
    @Override
    public void run() {
        
        int counter = 0;
        //create counter variable to see how many times the loop runs
        
        while (!done) { // Check the flag
            System.out.println("Thread is running...");
            System.out.println(getName() + " is running, Count: " + counter++);
            try {
                Thread.sleep(100); // Sleep for a while to simulate work
            } catch (InterruptedException e) {
                this.done = true; // Set done to true if interrupted
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            //why this method? Because if we don't put sleep here, 
            //the loop will run too fast and may consume too much CPU
        }
        
        System.out.println("Thread is stopping...");
    }
    
    // Method to stop the thread by setting the flag to true
    public void stopThread() {
        done = true;
        System.err.println("Flag set to true, stopping " + getName() +" thread...");
    }
}
