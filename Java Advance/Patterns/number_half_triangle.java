public class number_half_triangle {
    public static void main(String args[]) {

        // for (int i = 1; i <= 5; i++) {
        // int num=1;
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);                   This code is written by me which is not efficent .
        // num++;
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}