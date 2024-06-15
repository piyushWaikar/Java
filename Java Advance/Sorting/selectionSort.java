public class selectionSort {
    
    public static void print(int a[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 89, 56, 34, 11, 78 };

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        print(arr, n);

    }
}