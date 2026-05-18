package pekan7_2511533013;

public class InsertionSort_2511533013 {
    public static void InsertionSort_2511533013(int[] arr) {
        int n_3013 = arr.length;
        for (int i_3013 = 1; i_3013 < n_3013; i_3013++) {
            int key = arr[i_3013];
            int j_3013 = i_3013 - 1;
            while (j_3013 >= 0 && arr[j_3013] > key) {
                arr[j_3013 + 1] = arr[j_3013];
                j_3013--;
            }
            arr[j_3013 + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3013 = arr.length;
        System.out.println("array yang belum terurut:\n");
        for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
            System.out.print(arr[i_3013] + " ");
            System.out.println("");
            InsertionSort_2511533013(arr);
        }
            System.out.println("array yang terurut:\n");
            for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
                System.out.print(arr[i_3013] + " ");
                System.out.println("");
        }
    }
}
