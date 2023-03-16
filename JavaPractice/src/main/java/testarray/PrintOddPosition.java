package testarray;

public class PrintOddPosition {
	
	int []array= {10,15,11,20,25,30};
	public void PrintOdd() {
		System.out.println("your array element is");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			System.out.print(" ");
			
			
			}
		System.out.println("\nOdd position element is :");
		for(int i=0;i<array.length;i++) {
			
			if(i%2!=0) {
			System.out.print(array[i]);
			System.out.print(" ");
			}
			
			}
		
		}

	public static void main(String[] args) {

		PrintOddPosition object=new PrintOddPosition();
		object.PrintOdd();
		
	}

}
