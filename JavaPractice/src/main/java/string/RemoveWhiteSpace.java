package string;

public class RemoveWhiteSpace {
	public static void remove(String sentence){
		System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
	}

	public static void main(String[] args) {
		String sentence="welcome to the ojas";
		remove(sentence);

	}

}
