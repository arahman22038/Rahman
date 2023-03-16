package ArrayMatrics;

import java.util.Arrays;

public class AdditionOfTwoMatrics {

	public static void main(String[] args) {
		int[][]a= {{1,0,1},{4,5,6},{1,2,3}};
		int [][]b= {{1,1,1},{2,3,1},{1,5,1}};
		
		int [][]sum=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]);
				System.out.print(" ");
				
				
			}
			System.out.println( );
		}
		


	}

}
