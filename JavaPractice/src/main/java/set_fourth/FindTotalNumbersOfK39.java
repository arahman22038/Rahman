package set_fourth;

public class FindTotalNumbersOfK39 {
	public static void findNumbers(int []arr,int t){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(t==arr[i]){
				count++;
			}
		}
		System.out.println("The total number of 1’s present is "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={0, 0, 0, 0, 1, 1, 1};
		int t=1;
		findNumbers(arr,t);
		
	}

}
