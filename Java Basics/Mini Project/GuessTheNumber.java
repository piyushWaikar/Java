// Q] Make a game that generates the random number and this number will be guessed by the player .

import java.util.*;

public class GuessTheNumber {

    public static int randomNumb() {
        int numb = ((int) (Math.random() * 100));
        return numb;
    }

    public static void main(String args[]) {

        int randomNub = randomNumb();
        System.out.print("Random number Generated is : ");
        System.out.println(randomNub);
        int number;

        while (true) {
            System.out.println("Enter the Guess number : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (randomNub == number) {
                System.out.println("Number found");
                break;
            } else if (randomNub > number) {
                System.out.println("The number is lesser than required");
            } else if (randomNub < number) {
                System.out.println("The number is Greater than required");
            }

        }
        System.out.println("Thank You for Playing Game");
    }
}