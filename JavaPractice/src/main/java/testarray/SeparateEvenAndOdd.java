package testarray;

public class SeparateEvenAndOdd {
	
	public static int[] separateEvenOddNumbers(int arr[])
	{
		  int left=0;
		  int right=arr.length-1;
		  for (int i = 0; i < arr.length; i++) {
		 
		   while(arr[left]%2==0)
		   {
		    left++;
		   }
		   while(arr[right]%2==1)
		   {
		    right--;
		   }
		 
		   if(left<right)
		   {
		    int temp=arr[left];
		    arr[left]=arr[right];
		    arr[right]=temp;
		   }
		  }
		  return arr;
		}
	public static void main(String[] args) {
		
		int array[] = { 18, 1, 21,18,28, 29, 88,4, 19 };
		array=separateEvenOddNumbers(array);
		System.out.println("Array after separating even and odd numbers : ");
		  for (int i = 0; i < array.length; i++) {
		   System.out.print(array[i]+" ");
		  }
		

	}

}
