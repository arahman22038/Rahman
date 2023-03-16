package string;

public class ReverseString_07 {

	public static void removespaces(String str1) {
		String reversedStr = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + str1.charAt(i);
		}
		System.out.println("Original string: " + str1);
		System.out.println("Reverse of given string: " + reversedStr);
	}
	public static void main(String[] args) {
		String str1 = "The Sky is Blue";
		removespaces(str1);
	}
}
