package testarray;

import java.util.HashSet;

public class RemoveDuplicateElement {
	int array[] = { 18, 18, 25, 25, 21,18,25, 28, 28, 29 };
	public  void removeDuplicates() {
		HashSet<Integer>set=new HashSet();
		for(int i=0;i<array.length;i++) {
		 set.add(array[i]);
		}
		System.out.println("after removing of the duplicate element your array is:");
		for(int arr:set) {
			System.out.println(arr+" ");
		}
	
	}

	public static void main(String[] args) {

		RemoveDuplicateElement object=new RemoveDuplicateElement();
		object.removeDuplicates();
		
		
		
		
		

	}

}
