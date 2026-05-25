package pekan8_2511533013;
public class MergeSort_2511533013 {
    void merge(int arr[], int l_3013, int m_3013, int r_3013) {
        // Find sizes of two subarrays to be merged
        int n1_3013 = m_3013 - l_3013 + 1;
        int n2_3013 = r_3013 - m_3013;
        /* Create temp arrays */
        int L_3013[] = new int[n1_3013];
        int R_3013[] = new int[n2_3013];
        /* Copy data to temp arrays */
        for (int i_3013 = 0; i_3013 < n1_3013; ++i_3013)
            L_3013[i_3013] = arr[l_3013 + i_3013];
        for (int j_3013 = 0; j_3013 < n2_3013; ++j_3013)
            R_3013[j_3013] = arr[m_3013 + 1 + j_3013];
        int i_3013 = 0, j_3013 = 0;
        // Initial index of merged subarray array
        int k_3013 = l_3013;
        while (i_3013 < n1_3013 && j_3013 < n2_3013) {
            if (L_3013[i_3013] <= R_3013[j_3013]) {
                arr[k_3013] = L_3013[i_3013];
                i_3013++;
            } else {
                arr[k_3013] = R_3013[j_3013];
                j_3013++;
            }
            k_3013++;
        }
        /* Copy remaining elements of L[] if any */
        while (i_3013 < n1_3013) {
            arr[k_3013] = L_3013[i_3013];
            i_3013++;
            k_3013++;
        }
        /* Copy remaining elements of R[] if any */
        while (j_3013 < n2_3013) {
            arr[k_3013] = R_3013[j_3013];
            j_3013++;
            k_3013++;
        }
    }
    void sort(int arr_3013[], int l_3013, int r_3013) {
        if (l_3013 < r_3013) {
            // Find the middle point
            int m_3013 = (l_3013 + r_3013) / 2;
            // Sort first and second halves
            sort(arr_3013, l_3013, m_3013);
            sort(arr_3013, m_3013 + 1, r_3013);
            // Merge the sorted halves
            merge(arr_3013, l_3013, m_3013, r_3013);
        }
    }
    /* A utility function to print array of size n */
    static void printArray(int arr_3013[]) {
        int n_3013 = arr_3013.length;
        for (int i_3013 = 0; i_3013 < n_3013; ++i_3013)
            System.out.print(arr_3013[i_3013] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr_3013[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_3013);
        MergeSort_2511533013 ob_3013 = new MergeSort_2511533013();
        ob_3013.sort(arr_3013, 0, arr_3013.length - 1);
        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray(arr_3013);
    }
}