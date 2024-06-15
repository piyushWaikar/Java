public class Parallogram {
    public static void main(String args[]) {

        for (int i = 5; i >= 1; i--) {

            // For spaces :
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }

            // For Stars :
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}