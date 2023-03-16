package testarray;

import java.util.Scanner;

public class CalculateAvgOfArray {
	Scanner sc=new Scanner(System.in);
	
	int []array=new int[5];
	
	public int CalAvgOfArray(){
		int averge=0;
		for(int i=0;i<array.length;i++){
		System.out.println("enter the value of "+i);
		array[i]=sc.nextInt();
		averge+=array[i];
		}
		averge=averge/5;
		
		return averge;
	}

	public static void main(String[] args) {
		CalculateAvgOfArray obj=new CalculateAvgOfArray();
		int averge=obj.CalAvgOfArray();
		System.out.println("Average of the given array is "+averge);
		

	}

}
