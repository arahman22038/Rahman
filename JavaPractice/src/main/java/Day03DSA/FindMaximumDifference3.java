package Day03DSA;

public class FindMaximumDifference3 {
	public static void findDiff(int[]array){
		int first=0,second=0,diff=0;
		
		for(int i=0;i<array.length;i++){
			
			for(int j=i+1;j<array.length;j++){
				
				if(diff<(array[j]-array[i])){
					first=i;
					second=j;
					diff=(array[j]-array[i]);
				}
			}
		}
		System.out.println("Maximum difference is "+diff);
		System.out.println("The pair is "+array[first]+" "+array[second]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= { 2, 7, 9, 5, 1, 3, 5 };
		findDiff(array);
	}

}
