package saurabh1;

public class Student {
	int a;
	
	public void method1() {
		System.out.println("welocome to new place");
	}

	public static void main(String [] args) {
		Student obj = new Student();
		obj.method1();
		obj.a =12;
		System.out.println(obj.a);
		obj.a = 2334;
		System.out.println(obj.a);
	}
}
