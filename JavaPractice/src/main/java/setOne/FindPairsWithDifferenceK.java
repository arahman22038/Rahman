package setOne;

public class FindPairsWithDifferenceK {
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
		int []arr ={1, 5, 2, 2, 2, 5, 5, 4};
			int k = 3;
			FindKDifferencePair(arr,k);

	}

}
