package set_two;

public class LeftRotateArray19 {
	
	public static void leftRotate(int[]array,int k){
		for(int i=0;i<k;i++){
			int first,j;
			first=array[0];
			
			for(j=0;j<array.length-1;j++){
				array[j]=array[j+1];
			}
			array[j]=first;
		}
		for(int i=0;i<array.length;i++){
			
			System.out.print(" "+array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={ 1,2,3,4,5, };
		int n=2;
		leftRotate(array,n);

	}

}
