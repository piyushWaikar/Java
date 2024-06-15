
class MyThreads implements Runnable {
    String message;

    MyThreads(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + "-" + i);
            try {
                Thread.sleep(2500);
                System.out.println();
            } catch (Exception e) {
            }
        }
    }
}

public class MultiTasking_interface {
    public static void main(String args[]) {

        MyThreads obj1 = new MyThreads("Hello");
        Thread T1 = new Thread(obj1);

        MyThreads obj2 = new MyThreads("Hii");
        Thread T2 = new Thread(obj2);

        MyThreads obj3 = new MyThreads("Namaste");
        Thread T3 = new Thread(obj3);

        T1.start();
        T2.start();
        T3.start();

    }
}