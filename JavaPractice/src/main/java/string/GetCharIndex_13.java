package string;

public class GetCharIndex_13 {
public static void getindex(String str) {
	System.out.println("The Original String is: "+str);
	// Get the character at this  positions 0 and 10.
	int index1=str.charAt(0);
	int index2=str.charAt(10);
	//for printing the result pupose we are using these statements
    System.out.println("The character at position 0 is " +
        (char)index1);
    System.out.println("The character at position 10 is " +
        (char)index2);
}

	public static void main(String[] args) {
		 String str = "Java Exercises!";
		 getindex(str);
	}

	}
