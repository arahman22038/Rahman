package setOne;

public class FindMajorityElement {

	public static void findMajorityOccurrence(int[] arr) {
		int count=1;
		int element=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					
					count++;
					element=arr[i];
					break;
				}
			}
			
		}
		if(count>=arr.length/2){
			System.out.println("majority element is "+element);
		}
		
		System.out.println("element occurrence is  "+count);
			
		

		

	}

	public static void main(String[] args) {
		int[] array = { 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2 };
		findMajorityOccurrence(array);
		
		

	}

}
