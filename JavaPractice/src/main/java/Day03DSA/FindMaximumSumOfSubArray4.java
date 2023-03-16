package Day03DSA;

public class FindMaximumSumOfSubArray4 {
	public static void findSub(int[] array) {
		int first = 0, last = 0, sum = 0, max = 0;
		for (int i = 0; i < array.length; i++) {

			sum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				sum += array[j];
				if (max < sum) {
					first = i;
					last = j;
					max = sum;
				}
			}
		}
		System.out.println("Maximum value "+max);
		for (int i = first; i <= last; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		//int []array={8, -7, -3, 5, 6, -2, 3, -4, 2};
		findSub(array);

	}

}
