package set_two;

public class FindDuplicateKRange18 {
	public static void findDuplicate(int []arr,int k){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					if(i<=k){
						System.out.println("Duplicates found");
						
					}else
						System.out.println("Duplicate were not found");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={ 5, 6, 8, 2, 4, 6, 9 };
//		int k=4;
//		int arr[] = { 5, 6, 8, 2, 4, 6, 9 };
//		int k = 2;
		int []arr={ 1, 2, 3, 2, 1 };
		int k = 7;
		findDuplicate(arr,k);

	}

}
