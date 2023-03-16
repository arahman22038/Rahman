package collection;

import java.util.Hashtable;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,4,5};
		Vector<Integer>v=new Vector();
		Vector<String>s=new Vector();
		Hashtable<Integer,String>ht=new Hashtable();
		
		//add the element of the vector then we use addElement method
		v.addElement(1);
		v.addElement(2);
		//while here we use put method to add the element in hashtable
		ht.put(1, "Rahman");
		ht.put(2, "Naveed");
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		
		
		

	}

}
