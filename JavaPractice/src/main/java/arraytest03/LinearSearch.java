package arraytest03;

public class LinearSearch {
	public static int findValue(int []array,int k){
		int index=0; 
		for(int i=0;i<array.length;i++){
			if(array[i]==k){
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int []array={2,5,6,10,11,15,7};
		int index=findValue(array,11);
		System.out.println("value of the particular found this index no:"+index);
	}

}
