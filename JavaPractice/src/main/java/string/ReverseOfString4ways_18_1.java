package string;

public class ReverseOfString4ways_18_1 {
public static void reversestring1(String str) {
	

	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		str=ch+str;
		
	}
	   System.out.println("Reversed word: "+ str);
}
	public static void main(String[] args) {
		String str="Javat Point", str1=" ";
		reversestring1(str);

	}
}
