public class Fibonacci {

    public static void fibbo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        fibbo(b, c, n - 1);
    }

    public static void main(String args[]) {

        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        int n = 10;

        fibbo(a, b, n - 2);

    }
}