package set_fourth;

public class FindTargetValue35 {
public static void findTargetIndex(int[]arr,int t){
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(t==arr[i]){
			System.out.println("index of the given target value is "+i);
			count++;
		}
	}
	if(count==0){
		System.out.println("Target value is not found. Thanku!");
	}
}
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5,7, 9};
		int target=7;
		findTargetIndex(arr,target);
	}

}
