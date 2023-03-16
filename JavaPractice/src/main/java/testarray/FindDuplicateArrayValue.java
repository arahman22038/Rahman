package testarray;

import java.util.Scanner;

public class FindDuplicateArrayValue {
	Scanner sc=new Scanner(System.in);
	int []array= {10,15,11,20,25,30,11,1,88,20,1,10,14,0,52,14};
	
	public void findDuplicateValue() {
		
		for(int i=0;i<array.length;i++) {

			for(int j=i+1;j<array.length;j++) {
				
				if((array[j]==array[i])) {
					
					System.out.println("duplicate value of array is "+array[i]);
					
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		FindDuplicateArrayValue object=new FindDuplicateArrayValue();
		object.findDuplicateValue();


	}

}
