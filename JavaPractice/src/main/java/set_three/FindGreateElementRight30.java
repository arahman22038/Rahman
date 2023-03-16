package set_three;

import java.util.HashSet;
import java.util.Set;

public class FindGreateElementRight30 {
	

	public static void findGreateElement(int[] arr) {
		Set<Integer>array=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] >arr[j]) {
					array.add(arr[i]);
					//System.out.print(" "+arr[j]);
					break;
				} else {
					array.add(arr[j]);
					//System.out.print(" "+arr[i]);
					break;
				}

			}
			
		}
		System.out.println(array);
		
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 6, 3, 5 };
		findGreateElement(arr);

	}

}
