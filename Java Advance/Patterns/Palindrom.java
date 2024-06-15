public class Palindrom {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {

            // Spaces :
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // 1st half :
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // 2nd half : 
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}