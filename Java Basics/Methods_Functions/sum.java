import java.util.*;

public class sum {

    public static void sumof(int a, int b) {
        System.out.print("Sum is ");
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        sumof(a, b);

    }
}