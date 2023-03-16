package set_three;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sortUsingSelctionAlg(int[] arr) {
		int temp;
		int min_index;
		for (int i = 0; i < arr.length; i++) {
			min_index=i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index=j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		
		 System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
		}

	}


	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 2, 6, 5,0,4 };
		sortUsingSelctionAlg(arr);

	}

}
