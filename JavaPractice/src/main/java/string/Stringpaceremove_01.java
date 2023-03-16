package string;

public class Stringpaceremove_01 {

	public static void removespaces(String str1) {
		str1 = str1.replaceAll("\\s+", "");
		System.out.println("String after removing all the white spaces : " + str1);
	}

	public static void main(String[] args) {
		String str1 = "Ojas Innovative Technologies";
		removespaces(str1);
	}

}
