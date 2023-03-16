package set_fourth;

public class AllCombinationOfPositiveIntegerN50 {
	public static void print(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(" "+i);
				
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		print(n);
	}
	
}
