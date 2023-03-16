package setOne;

public class FindPairOfTargetSum {

	public static void main(String[] args) {

		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(" pair found " + nums[i] + " " + nums[j]);
				}
			}
		}

	}

}
