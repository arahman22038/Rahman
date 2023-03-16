package set_two;

public class RightRotateArray20 {
	
	public static void rightRotate(int[]array,int k){
		for(int i=0;i<k;i++){
			int last,j;
			last=array[array.length-1];
			
			for(j=array.length-1;j>0;j--){
				array[j]=array[j-1];
			}
			array[0]=last;
		}
		for(int i=0;i<array.length;i++){
			
			System.out.print(" "+array[i]);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={ 1, 2, 3, 4, 5, 6, 7 };
		int n=3;
		rightRotate(array,n);

	}

}
