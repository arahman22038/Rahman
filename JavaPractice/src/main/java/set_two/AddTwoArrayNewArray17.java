package set_two;

import java.util.Arrays;

public class AddTwoArrayNewArray17 {
	public static void addArray(int[]a,int []b){
		
		int aLength=a.length;
		int bLength=b.length;
		int newLength=a.length+b.length;
		int []newArray=new int[newLength];
		System.arraycopy(a,0,newArray,0,aLength);
		System.arraycopy(b,0,newArray,aLength,bLength);
		System.out.println(Arrays.toString(newArray));
		
	}
	public static void main(String []args){
		int []a={2,3,4,5,6};
		int []b={7,8,9,10,};
		addArray(a,b);
	}
}
