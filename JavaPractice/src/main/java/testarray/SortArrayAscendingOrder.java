package testarray;

import java.util.Arrays;

public class SortArrayAscendingOrder {
	

	int array[] = { 18, 1, 25,30, 2, 21,18,28, 29, 88,0, 19 };
	public void sortArray() {
		System.out.println("Before sorting my array elemetn:");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		Arrays.sort(array);
		
		System.out.println("\n................");
		System.out.println("after sorting my array elemetn:");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
	}

	public static void main(String[] args) {
		SortArrayAscendingOrder object=new SortArrayAscendingOrder();
		object.sortArray();

	}

}
