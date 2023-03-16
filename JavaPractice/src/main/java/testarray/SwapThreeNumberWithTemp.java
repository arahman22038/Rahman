package testarray;

public class SwapThreeNumberWithTemp {
	
	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		int number3=30;
		int temp;
		System.out.println("before first and second third value respectively"+number1 +" " +number2 +" "+number3);
		temp=number1;
		number1=number2;
		number2=number3;
		number3=temp;
		System.out.println("After swaping first and second third value respectively"+number1 +" "+number2 +" "+number3);
		
		
	}
	

}
