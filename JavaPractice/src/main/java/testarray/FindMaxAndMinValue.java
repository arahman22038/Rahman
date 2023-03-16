package testarray;

import java.util.Scanner;

public class FindMaxAndMinValue {
	Scanner sc=new Scanner(System.in);
	int []array= {10,15,11,20,25,30,41,1,12};
	public int findMax() {
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	public int findMin() {
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		FindMaxAndMinValue object=new FindMaxAndMinValue();
		int max=object.findMax();
		System.out.println(" your array Maximum value is "+max);
		
		int min=object.findMin();
		System.out.println(" your array minmum value is "+min);

	}

}
