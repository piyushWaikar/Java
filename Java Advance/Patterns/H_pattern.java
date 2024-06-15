public class H_pattern {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) {
            // Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int h = 1; h <= 8 - 2 * i; h++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // Now for inverse :

        for (int i = 4; i >= 1; i--) {
            // Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int h = 1; h <= 8 - 2 * i; h++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}