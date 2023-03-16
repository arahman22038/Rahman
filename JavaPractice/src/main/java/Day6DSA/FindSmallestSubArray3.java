package Day6DSA;

public class FindSmallestSubArray3 {
	

public static void FindKDifferencePair(int[]arr,int k){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				
				if( (arr[j]-arr[i])==k){
					
					System.out.println(+arr[i] +" "+arr[j] );
					break;
				}
			}
		}
}
	public static void main(String[] args) {
		int []array={ 2, 7, 9, 5, 1, 3, 5 };
		int k=7;
		FindKDifferencePair(array,k);

	}

}
