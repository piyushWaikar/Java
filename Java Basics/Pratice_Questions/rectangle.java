
// Q] To calculate : a * b / a-b by java program .

public class rectangle {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;

        int sum = a * b / a - b;
        System.out.println(sum);

        sum = (a * b) / (a - b);  // This is correct .
        System.out.println(sum);

    }
}