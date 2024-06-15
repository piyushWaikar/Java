import java.util.Scanner;

public class user_input_array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store : ");

        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Array elements are : ");

        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }

    }
}