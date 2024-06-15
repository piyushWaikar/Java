public class half_pyramid180 {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {
            // Inner loop for --> spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for --> stars 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}