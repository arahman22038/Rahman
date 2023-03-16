package set_fourth;

public class FindFrequencyOfEachElement34 {
	public static void findFrequency(int []array){
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
				System.out.print(" "+array[i] + ":" + freq[i]+",");
			   
			
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9};
		findFrequency(array);
	}

}
