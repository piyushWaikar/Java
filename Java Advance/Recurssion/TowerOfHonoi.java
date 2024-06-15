import java.util.Scanner;

public class TowerOfHonoi {

    public static void towerOfHonoi(int disc, String src, String helper, String dest) {
        if (disc == 1) {
            System.out.println("Tranfer the disk " + disc + " from " + src + " to " + dest);
            return;
        }
        towerOfHonoi(disc - 1, src, dest, helper);
        System.out.println("Tranfer the disk " + disc + " from " + src + " to " + dest);
        
        towerOfHonoi(disc - 1, helper, src, dest);

    }

    public static void main(String args[]) {

        System.out.print("Enter the number of Disk : ");

        Scanner sc = new Scanner(System.in);
        int disc = sc.nextInt();

        towerOfHonoi(disc, "S", "H", "D");

    }
}