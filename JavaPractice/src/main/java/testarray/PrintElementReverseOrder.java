package testarray;

public class PrintElementReverseOrder {
	
	int []array= {10,15,11,20,25,30};
	
		
		public void PrintResverse() {
			System.out.println("Before reverse your array element is");
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]);
				System.out.print(" ");
				
				
				}
			System.out.println("\nAfter reverse your array element is");
			
			
			for(int i=array.length-1;i>=0;i--) {
				System.out.print(array[i]);
				System.out.print(" ");
				
				
				}
			}
	public static void main(String[] args) {
		PrintElementReverseOrder object=new PrintElementReverseOrder();
		object.PrintResverse();

	}

}
