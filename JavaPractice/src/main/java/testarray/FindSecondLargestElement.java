package testarray;

public class FindSecondLargestElement {
	int array[] = { 18, 1, 25,30, 2, 21,18,28, 29, 88, 19 };
	public void findSecondLargestValue() {
		int first=array[0];
		int second=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>first) {
				second=first;
				first=array[i];
			}
			}
		System.out.println("Second largest value of the given array is "+second);
		}
	
	public static void main(String[] args) {
		FindSecondLargestElement object=new FindSecondLargestElement();
		object.findSecondLargestValue();


	}

}
