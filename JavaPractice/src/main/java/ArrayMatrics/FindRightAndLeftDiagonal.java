package ArrayMatrics;

public class FindRightAndLeftDiagonal {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public void findRigt() {
		for(int i=0;i<3;i++) {
			int RDsum=0;
			
			for(int j=0;j<3;j++) {
				RDsum+=a[i][j];
				
			}
			System.out.println(" "+RDsum);
		}
	}

	public void findLeft() {

	}

	public static void main(String[] args) {
		FindRightAndLeftDiagonal object=new FindRightAndLeftDiagonal();
		object.findRigt();
	}

}
