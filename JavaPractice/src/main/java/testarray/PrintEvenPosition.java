package testarray;

public class PrintEvenPosition {
	int []array= {10,15,11,20,25,30};
	
	public void PrintEven() {
		System.out.println(" your array element is");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			System.out.print(" ");
			
			
			}
		System.out.println("\nEven position element is :");
		for(int i=0;i<array.length;i++) {
			
			if(i%2==0) {
			System.out.print(array[i]);
			System.out.print(" ");
			}
			
			}
		
		}
	public static void main(String[] args) {
		
		PrintEvenPosition object=new PrintEvenPosition();
		object.PrintEven();
	}

}
