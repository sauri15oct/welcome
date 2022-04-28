package saurabh1;

public class Student1 {
	int age,rollno;
	public void method1() {
		System.out.println("welcome to all of you");
	}
	public void method2() {
		System.out.println("java is very Easy");
	}
	public static void main(String[] args) {
		Student1 abc = new Student1();
		
		abc.age = 29;
		abc.rollno =40;
		System.out.println(abc.age);
		System.out.println(abc.rollno);
		abc.method1();
		abc.method2();
		
	}

}
