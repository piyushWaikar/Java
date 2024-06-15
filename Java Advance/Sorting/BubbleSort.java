public class BubbleSort {

    public static void print(int a[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+"  ");
        }
    }

    public static void main(String args[]) {

        int a[] = { 67, 23, 89, 90, 11, 45 };

        int size = a.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    // Swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }

        print(a, size);

    }
}