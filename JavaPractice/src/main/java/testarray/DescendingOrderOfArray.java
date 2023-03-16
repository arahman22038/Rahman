package testarray;

import java.util.Arrays;

public class DescendingOrderOfArray {
	
	int array[] = { 18, 1, 25,30, 2, 21,18,28, 29, 88,0, 19 };
	public void descendingOrder() {
		System.out.println("Before sorting my array elemetn:");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		Arrays.sort(array);
//		System.out.println("After sorting your element is ");
//		System.out.println(Arrays.toString(array));
		
		System.out.println("\n................");
		System.out.println("Descending order  my array elemetn:");
		
		for(int i=array.length-1;i>=0;i--) {
			
			System.out.print(" "+array[i]);
		}
	}

	public static void main(String[] args) {

		DescendingOrderOfArray object=new DescendingOrderOfArray();
		object.descendingOrder();
	}

}
