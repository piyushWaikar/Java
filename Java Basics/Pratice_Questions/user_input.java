import java.util.*;

public class user_input {
    public static void main(String args[]) {

        int number;
        do {
            System.out.println("\nEnter the number : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            System.out.print("Here is your number : ");
            System.out.println(number);
        } while (number > 0);

        System.out.println("END");

    }
}