package string;

public class ReplaceOccurancenewChar_23 {
	public static void replaceoccurenewchar(String string) {
    System.out.println("String: "+string);
    String result = string.replaceFirst("(?:H)+", "B");
    System.out.println("String after replacing a character's first occurrence: "+result);
 }
	public static void main(String[] args) {
		String string = "The Hashmap extends from Map Hashtable nad Hashing mechanisums are there!";
		replaceoccurenewchar(string);
	}

}
