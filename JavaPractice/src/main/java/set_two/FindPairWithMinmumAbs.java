package set_two;

public class FindPairWithMinmumAbs {
	public static void minAbsPair(int []a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]+a[j]==-1){
					System.out.println("Pair with minimum absolute"+a[i]+" "+a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={-6, -5, -3, 0, 2, 4, 9};
		minAbsPair(array);

	}

}
