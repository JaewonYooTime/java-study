package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3();
		
		child.method1();
		child.method2();
		System.out.println(parent.field1);
		System.out.println(child.field1);
		System.out.println(child.field2);
	}
}
