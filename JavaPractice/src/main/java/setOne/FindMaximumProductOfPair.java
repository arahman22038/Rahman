package setOne;

public class FindMaximumProductOfPair {
	
	int[] nums = {-10,-3,5,6,-2};
	int target = nums[0]*nums[1];
	
	public void findMaxProdPair() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] * nums[j] >= target) {
					System.out.println(" pair found " + nums[i] + " " + nums[j]+" :" +target);
				}
			}
		}
	}
	

	public static void main(String[] args) {
		FindMaximumProductOfPair object=new FindMaximumProductOfPair();
		object.findMaxProdPair();

		

	}

	

}
