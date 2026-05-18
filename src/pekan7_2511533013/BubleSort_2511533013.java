package pekan7_2511533013;
public class BubleSort_2511533013 {
    public static void bubbleSort_2511533013(int[] arr) {
        int n_3013 = arr.length;
        for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
            for (int j_3013 = 0; j_3013 < n_3013 - i_3013 - 1; j_3013++) {
                if (arr[j_3013] > arr[j_3013 + 1]) {
                    int temp = arr[j_3013];
                    arr[j_3013] = arr[j_3013 + 1];
                    arr[j_3013 + 1] = temp;
                // System.out.println("data:" + arr[j_3013] + " " + arr[j_3013 + 1]);
                }
            }
        }
    }
    public static void main (String[] args) {
        int arr[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3013 = arr.length;
        System.out.println("array yang belum terurut:\n");
            for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
                System.out.print(arr[i_3013] + " ");
                System.out.println("");
                // minMaxSelectionSort_2511533013(arr, n);
            }
            bubbleSort_2511533013(arr);
            System.out.println("array yang terurut menggunakan Bubble Sort:");
            for (int i_3013 = 0; i_3013 < n_3013; i_3013++) {
                System.out.print(arr[i_3013] + " ");
                System.out.println("");
            }
        }
    }
