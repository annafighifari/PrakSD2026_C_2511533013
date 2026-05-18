package pekan7_2511533013;

public class SelectionSort_2511533013 {
    public static void SelectionSort_2511533013(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n = arr.length;
        System.out.println("array yang belum terurut:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            System.out.println("");
            SelectionSort_2511533013(arr);
        }
            System.out.println("array yang terurut:\n");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
                System.out.println("");
        }
    }
}
