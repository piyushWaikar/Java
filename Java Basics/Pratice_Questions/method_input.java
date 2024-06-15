import java.util.Scanner;

public class method_input {

    public static void printName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello , ");
        System.out.println(name);
    }

    public static void main(String args[]) {

        printName();

    }
}