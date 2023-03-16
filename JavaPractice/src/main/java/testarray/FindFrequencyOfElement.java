package testarray;

public class FindFrequencyOfElement {

	public static void frequencyOfElement(int []array) {

		
		int[] freq = new int[array.length];
		int visited = -1;

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					// To avoid counting same element again
					freq[j] = visited;
				}
			}
			if (freq[i] != visited)
				freq[i] = count;

			if (freq[i] != visited)
				System.out.println("    " + array[i] + "    |    " + freq[i]);
		}

	}

	public static void main(String[] args) {
		int[] array = { 5, 10, 15, 10, 10, 5, 15, 25 };
		frequencyOfElement(array);
	}
}
