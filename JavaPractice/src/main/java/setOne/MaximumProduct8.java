package setOne;

public class MaximumProduct8 {
	public static int findMaxProdSubset(int[]arr){
		int curPro=0;
		int maxPro=0;
		for(int i=0;i<arr.length;i++){
			
			curPro=curPro*arr[i];
			
			if(curPro>maxPro){
				maxPro=curPro;
			}
//			if(curPro<0){
//				curPro=0;
//			}
		}
		return maxPro;
		
		
	}

	public static void main(String[] args) {
		int[]arr={ -6, 4, -5, 8, -10, 0, 8 };
		
		int maxProd=findMaxProdSubset(arr);
		System.out.println(maxProd);

	}

}
