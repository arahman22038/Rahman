package testarray;

import java.util.Scanner;

public class RemoveSpecificElement {
	
	Scanner sc = new Scanner(System.in);
	int[] array = { 5, 10, 15, 20, 25 };

	public void removeSpecificValue() {

		int specificValue;
		System.out.println("enter your specific value which you want to find in the given array");
		specificValue = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (specificValue == array[i]) {
			array[i]=array[i+1];
			array[i]=array[i+2];
//			array[i]=array[i+3];
//			array[i+4]=0;
			
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(" "+array[i]);
		}

	}

	public static void main(String[] args) {
		
		RemoveSpecificElement obj=new RemoveSpecificElement();
		obj.removeSpecificValue();
	}

}
