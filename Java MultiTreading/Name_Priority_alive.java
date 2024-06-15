
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

public class Name_Priority_alive {
    public static void main(String args[]) {

        MyThreads t1 = new MyThreads("Hello");

        MyThreads t2 = new MyThreads("Hii");

        MyThreads t3 = new MyThreads("Namaste");

        // Thread Names :
        t1.setName("Hello Thread");
        t2.setName("Hii Thread");
        t3.setName("Namaste Thread");
        System.out.println("Priority for Thread First is : " + t1.getName());
        System.out.println("Priority for Thread Second is : " + t2.getName());
        System.out.println("Priority for Thread Third is : " + t3.getName());

        System.out.println();

        // Threads Priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
}