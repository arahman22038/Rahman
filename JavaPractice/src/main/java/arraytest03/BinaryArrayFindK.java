package arraytest03;

public class BinaryArrayFindK {
	
	 static void binarySearch(int array[], int k){
		 int low,  high;
		 int mid;
		 low = 0;
		 high = array.length - 1;
		 mid = (low+high)/2;
		 while (low <= high) {
		 if(array[mid] < k)
		 low = mid + 1;
		 else if (array[mid] == k) {
			 
			 System.out.println("found at location  "+k+ "  " +(mid+1));
		 break;
		 }
		 else
		 high = mid - 1;
		 mid = (low + high)/2;
		 }
		 if(low > high)
			 System.out.println("Not found!  isn't present in the list "+k);
		 
		 
		
		
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={5,10,15,20,25,30,35,40};
		
		binarySearch(array,15);

	}

}
