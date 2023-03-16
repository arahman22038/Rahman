package set_fourth;

import java.util.Arrays;

public class PritntAllZeroFirst48 {
	public static void print(int []arr){
		int pos=arr.length-1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[pos] = arr[i];
				pos--;
			}
		}
		while (pos >= 0) {
			arr[pos] = 0;
			pos--;
		}
		System.out.println("The array according to  is: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int []arr={ 1, 0, 1, 0, 1, 0, 0, 1 };
		print(arr);

	}

}
