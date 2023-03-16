package setOne;

public class MaxSumOfSubarray {
	
	public static int findMaxSum(int[]arr){
		int curSum=0;
		int maxSum=0;
		int start,s,end;
		start=0;
		s=0;end=0;
		for(int i=0;i<arr.length;i++){
			
			curSum=curSum+arr[i];
			
			if(curSum>maxSum){
				maxSum=curSum;
				start=s;
				end=i;
			}
			if(curSum<0){
				curSum=0;
				s=i+1;
			}
		}
		for(int i=start;i<=end;i++){
			System.out.print(" "+arr[i]);
		}
		return maxSum;
		
	}
	

	public static void main(String[] args) {
		int [] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int sum=findMaxSum(arr);
		System.out.println("\nSubarray with the largest sum is "+sum);
	}

}
