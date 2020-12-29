package B_09_수학2;

import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		int a[]=new int[100];
		Child c = new Child();
		Parent p = new Parent();
//		Child d = (Child)p;
//		System.out.println(c instanceof Parent);
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(3));
		
	}
	
}
class Parent{
	static int age = 0;
}
class Child extends Parent{
	int age = 1;
}