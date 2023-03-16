package string;

public class Lcase_Ucase_02 {

	public static void ucaselcase(String str1) {

		StringBuffer newStr = new StringBuffer(str1);

		for (int i = 0; i < str1.length(); i++) {

			if (Character.isLowerCase(str1.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}

			else if (Character.isUpperCase(str1.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);
	}
	public static void main(String[] args) {
		String str2 = " Olic Resources Handle by PhaniMam ";
		ucaselcase(str2);
	}

}
