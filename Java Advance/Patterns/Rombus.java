public class Rombus {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {

            // For Spaces :
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // For Stars :
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }

            // For Spaces :
            for (int h = 1; h <= 5 - i; h++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}