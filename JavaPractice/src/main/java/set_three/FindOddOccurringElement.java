package set_three;

public class FindOddOccurringElement {
	public static void findOddOccur(int[]array){
		for(int i=0;i<array.length; i++){
			int count=1;
			int element=0;
			for(int j=i+1;j<array.length;j++){
				
				if(array[i]==array[j]){
					count++;
					element=array[i];
				}
				
			}
			if(count%2!=0){
				System.out.println("odd occurrence element is "+element);
				return;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
		findOddOccur(array);

	}

}
