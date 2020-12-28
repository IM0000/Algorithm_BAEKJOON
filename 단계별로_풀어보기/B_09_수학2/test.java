package B_09_수학2;

public class test {

	public static void main(String[] args) {
		int a[]=new int[100];
		Child c = new Child();
		Parent p = new Parent();
//		Child d = (Child)p;
		System.out.println(c instanceof Parent);
		System.out.println(Math.sqrt(5));
		
	}
	
}
class Parent{
	static int age = 0;
}
class Child extends Parent{
	int age = 1;
}