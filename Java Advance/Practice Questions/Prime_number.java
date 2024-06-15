
import java.util.Scanner;

public class Prime_number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;



        // Condition : The prime number is the multiple of half of its number original number 
        // eg = 10 ; 10/2 = 5 , the factors of 10 will be multiple of first 5 number from 1 to 5 (2*5).
        // '1' is not prime nor composite so , the loop stats from 2 .
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime numbers ");
            }
        } else {
            System.out.println("This is not a prime number ");
        }
    }
}
