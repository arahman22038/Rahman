package testarray;

public class FindSecondSmallestNum {
	int array[] = { 18, 1, 25,30, 2, 21,18,28, 29, 88,0, 19 };
	public void findSecondSmallestNum() {
		int first=array[0];
		int second=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<first) {
				second=first;
				first=array[i];
			}
			if(array[i]!=first) {
				if(array[i]<second) {
					second=array[i];
				}
			}
			}
		System.out.println("Second Smallest value of the given array is "+second);
		}
	public static void main(String[] args) {
		FindSecondSmallestNum object=new FindSecondSmallestNum();
		object.findSecondSmallestNum();

	}

}
