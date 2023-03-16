package arraytest03;

public class FindEvenOddArray {
	public static void findEvenOdd(int []array){
		System.out.println("all even number :");
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
		System.out.println("all Odd number :");
		for(int i=0;i<array.length;i++){
			if(array[i]%2!=0){
				System.out.print(" "+array[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		int []array={1,2,5,6,8,3,7,10,14};
		findEvenOdd(array);

	}

}
