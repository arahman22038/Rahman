package set_three;

public class FindMissingNumber27 {
	
	public static void findMissNumber(int[] arr, int n) {
		int i;
		int[] temp = new int[n + 1];
		for (i = 0; i < n; i++) {
			temp[i] = 0;
		}
		for (i = 0; i < n; i++) {
			temp[arr[i] - 1] = 1;

		}
		int ans = 0;
		;
		for (i = 0; i < n; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println("The missing element is "+ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={ 3, 2, 4, 6, 1 };
		int n=arr.length;
		findMissNumber(arr,n);
		
	}

}
