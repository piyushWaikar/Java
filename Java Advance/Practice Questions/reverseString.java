import java.util.Scanner;

public class reverseString {

    public static void revString(int index, String str) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        revString(index - 1, str);
    }

    public static void main(String args[]) {

        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        revString(str.length() - 1, str); // length -1 because of zero bassed indexing

    }
}