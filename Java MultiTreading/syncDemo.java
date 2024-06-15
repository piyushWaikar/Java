class Counter implements Runnable {
    static int count; // Make count variable static to be shared among instances

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        count++;
    }
}

public class syncDemo {
    public static void main(String args[]) throws Exception {

        // Creating a single instance of the Counter class
        Counter c = new Counter();

        // Creating threads using the same instance
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        // Starting both threads
        t1.start();
        t2.start();

        // Waiting for both threads to finish
        t1.join();
        t2.join();

        // Printing the final count
        System.out.println("Count: " + Counter.count); // Access the static count variable
    }
}
