package testarray;

import java.util.Scanner;

public class ArrayContainSpecificValue2 {
	Scanner sc = new Scanner(System.in);
	int[] array = { 5, 10, 15, 20, 25 };

	public String findSpecificValue() {

		int specificValue;
		System.out.println("enter your specific value which you want to find in the given array");
		specificValue = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (specificValue == array[i]) {
				return "given value is availbe in the array ";
			}
			

		}

		return " not availble";

	}

	public static void main(String[] args) {
		ArrayContainSpecificValue2 obj=new ArrayContainSpecificValue2();
		String res=obj.findSpecificValue();
		System.out.println(res);

	}
}
