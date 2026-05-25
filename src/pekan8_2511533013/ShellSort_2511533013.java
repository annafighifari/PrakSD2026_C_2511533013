package pekan8_2511533013;

public class ShellSort_2511533013 {
	public static void shellSort(int[] A_3013) {
		int n_3013 = A_3013.length;
		int gap_3013 = n_3013 / 2;
		while (gap_3013 > 0) {
			for (int i_3013 = gap_3013; i_3013 < n_3013; i_3013++) {
				int temp_3013 = A_3013[i_3013];
				int j_3013 = i_3013;
				while (j_3013 >= gap_3013 && A_3013[j_3013 - gap_3013] > temp_3013) {
					A_3013[j_3013] = A_3013[j_3013 - gap_3013];
					j_3013 = j_3013 - gap_3013;
				}
				A_3013[j_3013] = temp_3013;
			}
			gap_3013 = gap_3013 / 2;
		}
	}
	public static void main(String[] args) {
		int[] data_3013 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray(data_3013);
		shellSort(data_3013);
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_3013);
	}
	public static void printArray(int[] arr_3013) {
		for (int i_3013 : arr_3013) System.out.print(i_3013 + " ");
		System.out.println();
	}
}