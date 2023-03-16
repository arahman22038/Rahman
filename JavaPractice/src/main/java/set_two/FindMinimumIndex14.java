package set_two;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinimumIndex14 {
	public static void min(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					list.add(i);
				}

			}

		}
		
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 6, 3, 4, 3, 6, 4 };
		min(array);
	}

}
