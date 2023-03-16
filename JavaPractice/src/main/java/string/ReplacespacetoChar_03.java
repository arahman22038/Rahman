package string;

public class ReplacespacetoChar_03{

	public static void replacespacrchar(String str, char ch1) {
		str = str.replace(' ', ch1);
		
		System.out.println("String after replacing spaces with given character: ");
		System.out.println(str);

	}

	public static void main(String[] args) {
		String str = "Java 203 Batch";
		char ch1 = '-';
		replacespacrchar(str, ch1);
	}
}
