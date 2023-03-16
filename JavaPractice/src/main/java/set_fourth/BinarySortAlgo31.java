package set_fourth;

public class BinarySortAlgo31 {
	public static void sortArrayUsingBinary(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (target == arr[i]) {
				System.out.println("Element found at index  " + i);
				count++;

			}
		}
		if (count == 0) {
			System.out.println("Element is not found!");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 7, 9, };
		int k = 7;
		// int []arr2={1, 4, 5, 8, 9};
		// int k=2;

		sortArrayUsingBinary(arr, k);

	}

}
