package setOne;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
	
	public static void pushZeroAtEnd(int []arr,int length) {
		int count=0;
		for(int i=0;i<length;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
				
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
			
		}
		System.out.println("After push the Zero at End ");
		for(int i=0;i<length;i++) {
			
			System.out.print(" "+arr[i]);
			
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,0,8,2,3,0,4,0,1};
        int n = arr.length;
        pushZeroAtEnd(arr,n);
        
    }
	

	

	}

