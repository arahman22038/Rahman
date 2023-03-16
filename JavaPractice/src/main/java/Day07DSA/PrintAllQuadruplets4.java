package Day07DSA;

public class PrintAllQuadruplets4 {
	public static void find(int[] array, int n, int target) {
		// Select the first element and find other three
		int count = 0;
		for (int i = 0; i < n - 3; i++) {
			// Select the second element and find other two
			for (int j = i + 1; j < n - 2; j++) {

				// Select the third element and find the fourth
				for (int k = j + 1; k < n - 1; k++) {
					// Find the fourth element
					for (int l = k + 1; l < n; l++)
						if (array[i] + array[j] + array[k] + array[l] == target)

							System.out.println(" " + array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
				}
			}
		}
		

	}

	public static void main(String[] args) {
		int[] array = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int target = 20;
		int n = array.length;

		find(array, n, target);
	}

}
