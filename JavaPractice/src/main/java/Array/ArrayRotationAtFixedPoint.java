package Array;

import java.util.Scanner;

public class ArrayRotationAtFixedPoint {
	Scanner sc=new Scanner(System.in);
	 int []nums=new int[7];
	//static int k=3;
//static int n=3;
	public void rotate(int k) {
		int size;
		System.out.println(" enter your size of the array");
		size=sc.nextInt();
		for(int i=0;i<size;i++) {
		System.out.println("enter your index value"+i);
		nums[i]=sc.nextInt();
		
		
		}

		if(k>nums.length)
			k=k%nums.length;
		int[]result=new int[nums.length];
		for(int i=0;i<k;i++) {
			result[i]=nums[nums.length-k+i];
			
		}
		int j=0;
		for(int i=k;i<nums.length;i++) {
			result[i]=nums[j];
			j++;
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

	public static void main(String[] args) {
		ArrayRotationAtFixedPoint obj=new ArrayRotationAtFixedPoint();
		obj.rotate(3);

	}

}
