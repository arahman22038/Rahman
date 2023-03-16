package setOne;

public class MinimumDifference {
	public static int findMinDiff(int[]arr,int x,int y){
		int n=arr.length;
		int pre=-1;
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]==x||arr[i]==y){
				if(pre!=-1&&arr[pre]!=arr[i]){
					minDiff=Math.min(minDiff, i-pre);
				}
				pre=i;
			}
		}
		return minDiff;
		
	}
	

	public static void main(String[] args) {
	
		int []arr = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
		int x = 3, y = 2;
		int minDiff=findMinDiff(arr,x,y);
		System.out.println("Minimum diff between the index of "+x+" and "+y+"="+minDiff);
	}

}
