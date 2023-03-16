package Day07DSA;

import java.util.Arrays;

public class SmallestElementKth {

	public static void FindKSmallestKth(int[] array, int k) {
		//Arrays.sort(array);
		//sort the element 
		for(int i=1;i<array.length;i++){
			int j=i;
			int a=array[i];
			while((j>0)&&(array[j-1]>a)){
				array[j]=array[j-1];
				j--;
			}
			array[j]=a;
			
		}
		System.out.println("\n k’th smallest array element is "  +array[k - 1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 7, 4, 6, 3, 9, 1 };
		int k = 2;
		FindKSmallestKth(array, k);

	}

}
