package string;

import java.util.Arrays;

public class RemoveDuplicatesofString_16 {

	public static void removeingDuplicates(String str1[], int length) {
		
		int index=0;int j=0;
		for(int i=0;i<length;i++) {
			for(j=0;j<i;j++) {
				if(str1[i]==str1[j]) {
					break;
				}
			}
			if(j==i) {
				str1[index++]=str1[i];
			}		
		}
		 System.out.println(String.valueOf(Arrays.copyOf(str1, index)));  		
	}
	public static void main(String[] args) {
		String str1="Failure is the Key To Success";
	int len=str1.length();
	//removeingDuplicates(str1,len);
		
	}

}
