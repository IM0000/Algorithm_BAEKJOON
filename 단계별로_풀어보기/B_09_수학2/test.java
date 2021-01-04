package B_09_수학2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Calendar;

import com.sun.jdi.Method;

enum Direction {
	East(1), West(2), South(3), North(4);

	private final int value;
	private final String symbol = "";

	Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
		int a[] = new int[100];
		Child c = new Child();
		Parent p = new Parent();
//		Parent p2 = (Parent)c;
//		Child d = (Child)p;
//		System.out.println(c instanceof Parent);
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(3));
		Another an = new Another();
		ArrayList<Child> list = new ArrayList();
		list.add(c);
		System.out.println(list.get(0));

//		ArrayList<? extends Child> pl = new ArrayList<Another>();
//		System.out.println(pl.get(0));
//		
		Direction d1 = Direction.East;
		System.out.println(Direction.values());
		System.out.println(d1.getValue());
		c.parentMethod();

		Class c1 = String.class;

		String str = new String();
		Class c2 = str.getClass();

		Class c3 = Class.forName("java.lang.String");
		Constructor[] cons = c3.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		System.out.println();

//		java.lang.reflect.Method[] methods = c3.getMethods();
//		for (java.lang.reflect.Method method : methods) {
//			System.out.println(method);
//		}
	}

}

class Parent {
	static int age = 0;
}

class Child extends Parent {
	int age = 1;

	@Deprecated
	void parentMethod() {
		System.out.println("deprecated use");
	}
}

class Another extends Child {
	int age = 1;
}