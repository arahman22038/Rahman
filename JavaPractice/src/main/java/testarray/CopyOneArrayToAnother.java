package testarray;

import java.util.Arrays;

public class CopyOneArrayToAnother {
	int array[]= {10,20,15,16,30};
	 static int []arrayCopy=new int[5];
	 int a=10;
	
	public  void copyArray() {
		
		for(int i=0;i<array.length;i++) {
			arrayCopy[i]=array[i];
		}
		System.out.println(Arrays.toString(arrayCopy));
	}
	

	public static void main(String[] args) {
		CopyOneArrayToAnother object=new CopyOneArrayToAnother();
		object.copyArray();
		
		System.out.println(Arrays.toString(arrayCopy) +" ");

	}

}
