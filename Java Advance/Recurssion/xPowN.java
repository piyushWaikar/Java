import java.util.Scanner;

public class xPowN {

    public static void powerOfX(int n, int x, int multi) {

        if (n == 0) {
            System.out.println("Answer : " + multi);
            return;
        }

        multi *= x;

        powerOfX(n - 1, x, multi);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x in x^n : ");
        int x = sc.nextInt();

        System.out.print("Enter the n in x^n : ");
        int n = sc.nextInt();

        powerOfX(n, x, 1);

    }
}