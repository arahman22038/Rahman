package arraytest03;

public class DisplayArrayElement {
	public static void display(int []array){
		System.out.println("Array element :");
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]);
		}
	}
	public static void main(String[] args) {
		int []array={5,2,10,9,2,3,5};
		display(array);
	

	}

}
