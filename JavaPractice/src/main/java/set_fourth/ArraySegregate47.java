package set_fourth;

import java.util.Arrays;

public class ArraySegregate47 {

	public static void printSegregate(int[] arr) {
		int i = 0, j = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
				j = j + 1;
			}

		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 9, -3, 5, -2, -8, -6, 1, 3 };
		printSegregate(arr);
	}

}
