package string;

public class ReplaceChar_14 {
public static void replacechar(String str) {
	// Replace all the 'd' characters with 'f' characters.
    String new_str = str.replace('d', 'f');

    // Display the strings for comparison.
    System.out.println("Original string: " + str);
    System.out.println("New String: " + new_str);
}
	

	public static void main(String[] args) {
         String str1=" Ram and shyam both are friends ";
         replacechar(str1);
	}

}
