import java.util.*;

public class logical {
    public static void main(String args[]) {

        System.out.println("Enter your age : ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("Child");
        }
        else if (age > 18 && age < 30) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }

    }
}