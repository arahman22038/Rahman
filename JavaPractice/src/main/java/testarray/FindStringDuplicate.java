package testarray;

public class FindStringDuplicate {
	
String []arrayString= {"Rahman","Rahi","Rajesj","Roson","Rahi","Ramesh","Rahman"};
	
	public void findDuplicateString() {
		
		for(int i=0;i<arrayString.length;i++) {

			for(int j=i+1;j<arrayString.length;j++) {
				
				if((arrayString[j].equals(arrayString[i]))) {
					
					System.out.println("duplicate value of array is "+arrayString[i]);
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		FindStringDuplicate object=new FindStringDuplicate();
		object.findDuplicateString();

	}

}
