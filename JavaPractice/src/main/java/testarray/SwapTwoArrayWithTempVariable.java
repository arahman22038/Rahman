package testarray;

import java.util.Arrays;

public class SwapTwoArrayWithTempVariable {
	int array1[] = { 10, 20, 5, 6, 12 };
	int[] array2 = { 15, 21, 8, 7, 11 };

	public void SwapArray() {
		System.out.println("your first array element is:");

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("your second array element is");

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int i=0;i<array1.length;i++) {
			array1[i]=array1[i]+array2[i];
			int temp=array1[i];
			array1[i]=array2[i];
			array2[i]=temp;
		}
		System.out.println("After swapping the value of the array1 and array2");
		System.out.println(Arrays.toString(array1));
		
		System.out.println(Arrays.toString(array2));
		
		
	}

	public static void main(String[] args) {
		SwapTwoArrayWithTempVariable object=new SwapTwoArrayWithTempVariable();
		object.SwapArray();
	}

}
