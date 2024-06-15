import java.util.*;

public class printN_Natural {

    public static void sumOfN(int n, int i, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        i++;
        sumOfN(n, i, sum);
        System.out.println(i);
    }

    public static void main(String args[]) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        sumOfN(num, 1, 0);

    }
}