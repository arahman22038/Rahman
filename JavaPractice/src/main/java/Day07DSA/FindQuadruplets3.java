package Day07DSA;

import java.util.Arrays;

public class FindQuadruplets3 {

	public static void find(int[] array, int n, int sum) {
		// Select the first element and find other three
		int count=0;
		for (int i = 0; i < n - 3; i++) {
			// Select the second element and find other two
			for (int j = i + 1; j < n - 2; j++) {

				// Select the third element and find the fourth
				for (int k = j + 1; k < n - 1; k++) {
					// Find the fourth element
					for (int l = k + 1; l < n; l++)
						if (array[i] + array[j] + array[k] + array[l] == sum) // Comparing the sum
							
															// with S

							System.out.println(" " + array[i] + " " + array[j] + " " + array[k] + " " +array[l]);
				}
			}
		}
		if(count>0){
			System.out.println("Quadruplet exists");
		}

	}

	public static void main(String[] args) {
		int[] array = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 20;
		int n = array.length;

		find(array, n, sum);
	}

}
