package testarray;

import java.util.Scanner;

public class FindIndexOfArrayElement3 {
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []array={5,10,15,20,25};
		int index;
		System.out.println("enter your specific index which data you want to fetch");
		index=sc.nextInt();
		System.out.println("your specific choice value is "+array[index]);
		

	}

}
