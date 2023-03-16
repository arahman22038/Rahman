package set_three;

import java.util.Arrays;

public class CountingSort {
	public static void sort(int[]array,int n){
		int max=0;
		for(int i=0;i<n;i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		int []newArray=new int[max+1];
		for(int i=0;i<=max;i++){
			newArray[i]=0;
			//newArray[array[i]]++;
		}
		for(int i=0;i<n;i++){
			//newArray[i]=0;
			newArray[array[i]]++;
		}
		
		
		for(int i=1;i<=max;i++){
//			
			newArray[i]+=newArray[i-1];
		}
		
		//for sorting array
		int []sortedArray=new int[n];
		for(int i=n-1;i>=0;i--){
			sortedArray[newArray[array[i]]-1]=array[i];
			newArray[array[i]]--;
		}
		for(int i=0;i<n;i++){
			System.out.print(" "+sortedArray[i]);
		}
		
	}

	public static void main(String[] args) {
		int[]array= { 1,2,3,2,5,4,5,3,2};
		int n=9;
		sort(array,n);

	}

}
