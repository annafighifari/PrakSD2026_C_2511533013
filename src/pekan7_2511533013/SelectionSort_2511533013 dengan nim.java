package pekan7_2511533013;

public class SelectionSort_2511533013 {
    public static void SelectionSort_2511533013(int[] arr) {
        int n_3013 = arr.length;
        for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
            int minIndex = i_3013;
            for (int j = i_3013 + 1; j < n_3013; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i_3013];
            arr[i_3013] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3013 = arr.length;
        System.out.println("array yang belum terurut:\n");
        for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
            System.out.print(arr[i_3013] + " ");
            System.out.println("");
            SelectionSort_2511533013(arr);
        }
            System.out.println("array yang terurut:\n");
            for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
                System.out.print(arr[i_3013] + " ");
                System.out.println("");
        }
    }
}
