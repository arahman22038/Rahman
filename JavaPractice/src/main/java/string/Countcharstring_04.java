package string;

public class Countcharstring_04 {
	
	public static void countstringchar(String string){
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
		
		System.out.println("Total number of characters in a string: " + count);
	}

	public static void main(String[] args) {
		String string = "India is a Farmers Country";
		countstringchar(string);
	}

}
