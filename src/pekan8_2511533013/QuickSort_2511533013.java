package pekan8_2511533013;

public class QuickSort_2511533013 {
    static void swap (int[] arr, int i_3013, int j_3013) {
        int temp = arr[i_3013];
        arr[i_3013] = arr[j_3013];
        arr[j_3013] = temp;
    }
    // metode tmbahan untuk mengatur pivot pakai median of three
    static void medianofThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        // urutkan elemen low, mid, dan high
        if (arr[low] > arr[mid]) {
            swap(arr, low, mid);
        }
        if (arr[low] > arr[mid]) {
            swap(arr, low, mid);
        }
            if (arr[mid] > arr[high]) {
            swap(arr, mid, high);
        }
        swap(arr, mid, high);
        }
        static int partition(int[] arr, int low, int high) 
        {
            // Panggil fungsi medianofthree sebelum menentukan pivot
            medianofThree(arr, low, high);

            int pivot = arr[high]; // sekarang arr[high] berisi nilai median
            int i = (low - 1);

            for (int j = low; j < high; j++) {
            //  Jika elemen saat ini lebih kecil dari atau sama dengan pivot
                if (arr[j] <= pivot) {
                    // Increment indeks elemen yg lebih kecil
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return i + 1;
        }
            static void quickSort(int[] arr, int low, int high) {
             if (low < high) {
                int pi = partition(arr, low, high);

                // Secara rekursif sort elemen sebelum dan sesudah partisi
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
             }
            }
            public static void printArr(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            public static void main(String[] args) {
                int[] arr = {10, 7, 8, 9, 1, 5};
                int n = arr.length;

                System.out.println("Data sebelum diurutkan:");
                printArr(arr);

                quickSort(arr, 0, n - 1);

                System.out.println("Data setelah diurutkan:");
                printArr(arr);
        }
    }
