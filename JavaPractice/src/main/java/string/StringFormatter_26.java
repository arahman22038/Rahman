package string;

public class StringFormatter_26 {
	public static String reverseofWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}     
	public static void main(String[] args) {  
	    System.out.println(StringFormatter_26.reverseofWord("my name is Chinni"));  
	    System.out.println(StringFormatter_26.reverseofWord("I want to Learn Spring boot"));    
	    }  
	}  
