package B_09_수학2;

public class test {

	public static void main(String[] args) {
		int a[]=new int[100];
		Child c = new Child();
		Parent p = new Parent();
		System.out.println(Parent.age);
		System.out.println(a[2]);
		
	}
	
}
class Parent{
	static int age = 0;
}
class Child extends Parent{
	int age = 1;
}