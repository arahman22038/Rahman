package Array;

public class LocalVariable {
	String[][] arr={{"abc"},{"def"},{"zyz"}};
	static int b;
	public  void localMethod(){
		 int a=0;
		String s=null;
		System.out.println(a);
	}
	public static void main() {
		LocalVariable object=new LocalVariable();
		System.out.println("hello everyone");
		

	}

	public static void main(String[] args) {
		LocalVariable object=new LocalVariable();
		object.localMethod();
		System.out.println(b);
		main();
		
		

	}

}
