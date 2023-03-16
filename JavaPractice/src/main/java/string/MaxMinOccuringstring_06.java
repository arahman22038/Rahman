package string;

public class MaxMinOccuringstring_06 {

	public static void maxminoccuring(String str) {
		 int[] freq = new int[str.length()];
//		 char minChar = str.charAt(0); 
//		 char maxChar = str.charAt(0);
		int i, j, min, max;
		char string[] = str.toCharArray();
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}
		//System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "Attitude Of Gratitude is a one Of Core Value od Oilc";
		maxminoccuring(str);
	}

}
