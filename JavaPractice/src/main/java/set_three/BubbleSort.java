package set_three;

import java.util.Arrays;

public class BubbleSort {
	public static void sortUsingBubbleAlg(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 2, 6, 5 };

		sortUsingBubbleAlg(arr);
	}

}
