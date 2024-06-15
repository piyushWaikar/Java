// This is more optimized method .

import java.util.Scanner;

public class xPowN_logn {

    public static int calcPower(int x, int n) {

        if (n == 0) {
            return 1; // Base case : 1
        }
        if (x == 0) {
            return 0; // Base case : 2
        }

        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x in x^n : ");
        int x = sc.nextInt();

        System.out.print("Enter the n in x^n : ");
        int n = sc.nextInt();

        int ans = calcPower(x, n);
        System.out.println("Answer : " + ans);

    }
}