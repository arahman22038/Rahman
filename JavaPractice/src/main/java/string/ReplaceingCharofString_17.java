package string;

public class ReplaceingCharofString_17 {
	public static void replacecharofstring(String string) {  
		char[] ch = string.toCharArray(); 
		  for(int i=0;i<ch.length;i++) {
			  if(i==1) {
				  char temp=ch[i];
				  ch[i]=ch[ch.length-1];
				  ch[ch.length-1]=temp;
			  }
			  System.out.print(ch[i]+ " ");
		  }	
	}
	public static void main(String[] args) {
		String string="a b c d e f";
		replacecharofstring(string);
	}

}
