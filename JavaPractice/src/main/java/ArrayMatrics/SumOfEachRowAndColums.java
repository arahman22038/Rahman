package ArrayMatrics;

public class SumOfEachRowAndColums {

	public static void main(String[] args) {
		
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		//row sum of the given matrics
		for(int i=0;i<3;i++) {
			int Rsum=0;
			
			for(int j=0;j<3;j++) {
				Rsum+=a[i][j];
				
			}
			System.out.println("sum of the row "+(i+1) +" "+Rsum);
		}
		//columns sum of the given matrics
		for(int i=0;i<3;i++) {
			int cSum=0;
			for(int j=0;j<3;j++) {
				
					cSum+=a[j][i];
			}
			System.out.println("sum of the column "+(i+1) +" "+cSum);
		}
		

	}

}
