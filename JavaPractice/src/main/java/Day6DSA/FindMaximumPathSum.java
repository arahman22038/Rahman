package Day6DSA;

public class FindMaximumPathSum {
	public static int findMaxSum(int[] array1, int[] array2) {
		int sum = 0;
		int sum_array1 = 0;
		int sum_array2 = 0;

		int m = array1.length, n = array2.length;

	
		int i = 0, j = 0;

		
		while (i < m && j < n) {
			
			while (i < m - 1 && array1[i] == array1[i + 1]) {
				sum_array1 += array1[i++];
			}

		
			while (j < n - 1 && array2[j] == array2[j + 1]) {
				sum_array2 += array2[j++];
			}

			
			if (array2[j] < array1[i]) {
				sum_array2 += array2[j];
				j++;
			}

			
			else if (array1[i] < array2[j]) {
				sum_array1 += array1[i];
				i++;
			}

			else {
				sum += Integer.max(sum_array1, sum_array2) + array1[i];

				
				i++;
				j++;

				
				sum_array1 = 0;
				sum_array2 = 0;
			}
		}
		
		while (i < m) {
			sum_array1 += array1[i++];
		}

		
		while (j < n) {
			sum_array2 += array1[j++];
		}

		sum += Integer.max(sum_array1, sum_array2);
		return sum;

	}

	public static void main(String[] args) {
	
		
		int []array1={ 3, 6, 7, 8, 10, 12, 15, 18, 100 };
		int []array2={ 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
		int sum=findMaxSum(array1,array2);
		System.out.println("Sum of the given array: "+sum);

	}

}
