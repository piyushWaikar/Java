import java.util.*;

public class printFactorial {

    public static void factorial(int n , int i , int multi){

        if(i==n){
            multi *=i;
            System.out.println("Factorial is : " + multi);
            return;
        }
        multi *= i;
        i++;
        factorial(n, i, multi);
    }

    public static void main(String args[]) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        factorial(numb, 01, 1);
    }
}