package Array;

import java.util.Arrays;

public class ArrayPairOfSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 9;
		// Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				System.out.println("pair found " + (arr[low] + " " + arr[high]));
				low++;
				high--;
			} else if ((arr[low] + arr[high]) < sum) {
				low++;

			} else 
				high--;

			
		}
	}
}
