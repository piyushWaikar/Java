import java.util.*;

public class if_else {
    public static void main(String args[]) {

        System.out.println("Enter your age : ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18 ) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

    }
}