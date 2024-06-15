public class InsertionSortt {

    public static void print(int a[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 89, 56, 34, 11, 78 };

        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j > 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        print(arr, size);
    }
}