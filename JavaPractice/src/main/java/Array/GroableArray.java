package Array;

import java.util.Arrays;

public class GroableArray {

	Object[] array = new Object[5];
	int Elementcount = 0;

	public void add(Object obj) {
		if (Elementcount == array.length) {
			sizeIncrease();
		}
		array[Elementcount] = obj;
		Elementcount++;
	}

	public void sizeIncrease() {
		Object[] newArray = new Object[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	public static void main(String[] arrgs) {
		GroableArray object = new GroableArray();
		object.add("a");
		object.add("b");
		object.add("c");
		object.add("d");
		object.add("e");
		object.add("e");
		object.add("a");
		object.add("b");
		object.add("c");
		object.add("a");
		object.add("b");
		object.add(1);
		System.out.println(Arrays.toString(object.array));
	}

}
