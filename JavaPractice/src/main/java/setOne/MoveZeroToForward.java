package setOne;

import java.util.Arrays;

public class MoveZeroToForward {
	int[] myArray = { 1, 0, 1, 0, 1, 0, 0, 1 };
	int pos = myArray.length - 1;

	public void moveZeroAtBegin() {
		for (int i = myArray.length - 1; i >= 0; i--) {
			if (myArray[i] != 0) {
				myArray[pos] = myArray[i];
				pos--;
			}
		}
		while (pos >= 0) {
			myArray[pos] = 0;
			pos--;
		}
		System.out.println("The array according to  is: " + Arrays.toString(myArray));
	}

	public static void main(String[] args) {
		MoveZeroToForward object=new MoveZeroToForward();
		object.moveZeroAtBegin();
	}
}
