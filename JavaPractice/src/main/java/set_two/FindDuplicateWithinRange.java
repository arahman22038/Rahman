package set_two;

public class FindDuplicateWithinRange {
		public static void findDupWithinK(int arr[],int k){
			
			for(int i=0;i<=arr.length;i++){
				
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						if(k<i){
							System.out.println("Duplicate found");
						}else{
							System.out.println("duplicate not found");
						}
							
					}
				}
			}
		}

	public static void main(String[] args) {
		
//		int []arr={ 5, 6, 8, 2, 4, 6, 9 };
//		int k = 4;
		int arr[]={ 5, 6, 8, 2, 4, 6, 9 };
		int k = 2;
		
		findDupWithinK(arr,k);
		
	}

}
