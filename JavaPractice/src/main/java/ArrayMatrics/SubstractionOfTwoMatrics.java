package ArrayMatrics;

public class SubstractionOfTwoMatrics {

	public static void main(String[] args) {
		
		int[][]a= {{4,5,6},{3,4,1},{1,2,3}};
		int [][]b= {{2,0,3},{2,3,1},{1,1,1}};
		
		int [][]subtraction=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				subtraction[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Subtraction of the two arrays");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(subtraction[i][j]);
				System.out.print(" ");
				
				
			}
			System.out.println( );
		}
	}

}
