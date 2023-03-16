package string;

public class Swap2String_12 {

	public static void swapstring(String a, String b) {

		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
	}

	public static void main(String[] args) {
		String a = "Like";
		String b = "Me";
		swapstring(a, b);
	}

}
