package set_fourth;

public class FindMissingNumber32 {
	
	public static void findMiss(int[] arr) {
		int i;
		int[] temp = new int[arr.length + 1];
		for (i = 0; i < arr.length; i++) {
			temp[i] = 0;
		}
		for (i = 0; i < arr.length; i++) {
			temp[arr[i] - 1] = 1;

		}
		int ans = 0;
		;
		for (i = 0; i < arr.length; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int []arr={ 3, 2, 4, 6, 1 };
		
		findMiss(arr);
	}

}
