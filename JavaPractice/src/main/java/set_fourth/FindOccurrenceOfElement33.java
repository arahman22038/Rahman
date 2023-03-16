package set_fourth;

public class FindOccurrenceOfElement33 {
	public static void findOccurence(int []arr,int n){
		int last=0;
		int first=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==n){
				if(first==0){
				System.out.println("The first occurrence of element 5 is located at index "+i);
				first++;
				}
				last++;
			}
			
		}
		if(last==0){
			System.out.println("Element not found in the array");
		}
		if(last>1)
		System.out.println("The last occurrence of element 5 is located at index "+last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		int[]arr={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		int n=5;
		findOccurence(arr,n);

	}

}
