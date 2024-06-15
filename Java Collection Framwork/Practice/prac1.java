import java.util.*;

public class prac1 {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Group you want : ");
        int m = sc.nextInt();

        sc.nextLine();

        for (int j = 0; j < m; j++) {

            System.out.println("Group [" + (j + 1) + "]");

            System.out.print("Enter the no. of names to be Entered : ");
            int n = sc.nextInt();

            // Consume the newline character
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the Name of person [" + (i + 1) + "] : ");
                list.add(sc.nextLine());
            }
        }



        System.out.println(list);
    }
}
