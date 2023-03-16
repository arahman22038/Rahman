package testarray;
import java.util.Arrays;
public class FindKLargestNumber {
	int array[] = { 18, 1, 25,30, 2, 21,18,28, 29, 88,0, 19 };
	
	public void FindKlargest(int k) {
		System.out.println("Before sorting my array elemetn:");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		Arrays.sort(array);
		System.out.println("\n................");
		System.out.println("after sorting my array elemetn:");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println("\n..k value");
		for(int i=array.length-1;i>=array.length-k;i--) {
			System.out.println(array[i]);
		}
		
	}
	public static void main(String[] args) {
		FindKLargestNumber object=new FindKLargestNumber();
		object.FindKlargest(4);
		
	}

}
