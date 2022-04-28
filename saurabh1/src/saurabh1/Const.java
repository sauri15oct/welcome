package saurabh1;

public class Const {
	 Const() {
		 this(3,2,4);
		System.out.println("default constructor");
	}
	 Const(int a) {
		 this(2,4,5,6);
			System.out.println("one parameterized constructor");
		}
	 Const(int a,int b) {
		 this();
			System.out.println("two parameterized  constructor");
		}
	 Const(int a,int b,int c) {
		
			System.out.println("three parameterized  constructor");
		}
	 Const(int a,int b,int c,int d) {
		 this(2,6);
			System.out.println("four parameterized  constructor");
		}
	 public static void main(String[] args) {
	/*	Const obj = new Const();
		Const obj1 = new Const(2);
		Const obj2 = new Const(23,56);
		Const obj3 = new Const(12,4,56);
		Const obj4 = new Const(1,2,3,4);*/
		 
		 Const obj1 = new Const(12);
		
	}
}
