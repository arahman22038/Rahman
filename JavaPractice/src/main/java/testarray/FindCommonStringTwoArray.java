package testarray;

public class FindCommonStringTwoArray {
	String []string1= {"Rahman","Rahi","Rajesj","Roson","Rakesh","Rani","Rahim"};
	String []string2= {"Rahi","Rakesh","Rahim","Raja","Rani"};
	String []common=new String[7];
public void findCommonString() {
		
		for(int i=0;i<string1.length;i++) {

			for(int j=0;j<string2.length;j++) {
				
				if((string1[i].equals(string2[j]))) {
					
					//System.out.println("common value of array is "+string2[j]);
					common[i]=string1[i];
					
				
				}
				
			}
			
		}
		System.out.println("......................");
		for(String a:common) {
			if(a!=null) {
			 System.out.print(a + " ");
			}
		}
	}

	public static void main(String[] args) {
		FindCommonStringTwoArray object=new FindCommonStringTwoArray();
		object.findCommonString();
		

	}

}
