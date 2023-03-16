package setOne;

public class SwapArray {

	public static void main(String[] args) {
		int arr[] = {3, 8, 6, 7, 5, 9};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			
			System.out.print(" "+arr[i]);
		}
		

	}

}
