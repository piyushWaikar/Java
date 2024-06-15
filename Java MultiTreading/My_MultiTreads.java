class MyThreads extends Thread {
    String message;

    MyThreads(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + "-" + i);
            try {
                Thread.sleep(2500);
            } catch (Exception e) {
            }
        }
    }
}

public class My_MultiTreads {
    public static void main(String args[]) {

        MyThreads t1 = new MyThreads("Hello");

        MyThreads t2 = new MyThreads("Hii");

        MyThreads t3 = new MyThreads("Namaste");

        t1.start();
        t2.start();
        t3.start();


    }
}