package testarray;

import java.util.Arrays;

public class SwapThreeArrayWithTemp {
	int []array1= {2,4,6,8,10};
	int []array2= {3,6,9,12,15};
	int []array3= {4,8,12,16,20};
	public void swapArray() {
		int temp;
		for(int i=0;i<array1.length;i++) {
			temp=array1[i];
			array1[i]=array2[i];
			array2[i]=array3[i];
			array3[i]=temp;
		}
		System.out.println("After swapping your all array element is :");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	}
	

	public static void main(String[] args) {
		SwapThreeArrayWithTemp object=new SwapThreeArrayWithTemp();
		object.swapArray();

	}

}
