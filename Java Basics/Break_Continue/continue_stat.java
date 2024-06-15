public class continue_stat {
    public static void main(String args[]) {

        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            } else {
                System.out.println(i);
                i++;
            }
        }

    }
}