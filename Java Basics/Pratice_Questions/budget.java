// Q] pen = 10 , book = 40 . Tell on the amount of money what can we buy . 

import java.util.*;

public class budget {
    public static void main(String args[]) {

        System.out.println("Enter the value : ");

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        if (money >= 10 && money < 40) {
            System.out.println("Buy the pen");
        } 
        else if (money >= 40 && money < 50) {
            System.out.println("Buy the Book");
        }
         else if (money > 0 && money < 10) {
            System.out.println("Buy nothing");
        }
         else if (money > 50) {
            System.out.println("Can buy both");
        }
         else {
            System.out.println("Error");
        }

    }
}