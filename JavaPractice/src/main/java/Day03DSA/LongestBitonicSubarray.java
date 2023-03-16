package Day03DSA;

public class LongestBitonicSubarray {
	
	public static void findBitonicSubarray(int[] subArray){
		
		if (subArray.length == 0) {
			return;
		}

		int[] increase = new int[subArray.length];
		increase[0] = 1;
		
		for (int i = 1; i < subArray.length; i++) {
			increase[i] = 1;
			if (subArray[i - 1] < subArray[i]) {
				increase[i] = increase[i - 1] + 1;
			}
		}
		int[] decrease = new int[subArray.length];
		decrease[subArray.length - 1] = 1;
		for (int i = subArray.length - 2; i >= 0; i--) {
			decrease[i] = 1;
			if (subArray[i] > subArray[i + 1]) {
				decrease[i] = decrease[i + 1] + 1;
			}
		}
		int calculateLBS = 1;
		int beginning = 0, end = 0;

		for (int i = 0; i < subArray.length; i++) {
			int len = increase[i] + decrease[i] - 1;
			if (calculateLBS < len) {
				calculateLBS = len;
				beginning = i - increase[i] + 1;
				end = i + decrease[i] - 1;
			}
		}
		System.out.println("The length of the longest bitonic subarray is " + calculateLBS);
		System.out.printf("The longest bitonic subarray indices is (%d, %d)", beginning, end);
	}
	public static void main(String[] args) {
		
		int[] subArray = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };
		findBitonicSubarray(subArray);

	}

}
