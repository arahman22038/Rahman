package set_fourth;

public class BinarySearchAlgo38 {
	public static void findTargetValue(int []array,int t){
		int count = 0;
		for (int i = 0; i < array.length; i++) {

			if (t == array[i]) {
				System.out.println("Element found at index  " + i);
				count++;

			}
		}
		if (count == 0) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={2, 3, 5, 7, 9};
				int t= 7;
				findTargetValue(array,t);

	}

}
