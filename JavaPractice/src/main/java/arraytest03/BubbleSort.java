package arraytest03;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int []array){
		System.out.println("After sorting our element is:");
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				int temp;
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int []array={5,6,10,23,89,14,25,10};
		System.out.println(Arrays.toString(array));
		sort(array);

	}

}
