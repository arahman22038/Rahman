package testarray;

import java.util.Scanner;

public class SumOfArray {
	Scanner sc = new Scanner(System.in);
	int[] array = new int[5];

	public int CalSumOfArray() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter your element value " + i);
			array[i] = sc.nextInt();
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfArray object=new SumOfArray();
		int sum=object.CalSumOfArray();
		System.out.println("sum of the array is "+sum);
	}

}
