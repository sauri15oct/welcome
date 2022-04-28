//(10+2)(10-2)
package saurabh1;

public class Student2 {
	public int add(int a, int b) {
		int x = a - b;
		System.out.println("the value of x = "+x);
		return x;
	}
	public int sub(int m, int n) {
		int l = m - n;
		System.out.println("the value of L = "+l);
		return l;
		}
	public void multi(int p,int q) {
		int r = p*q;
		System.out.println("After multiplication the result is ="+r);
	}

	public static void main(String[] args) {
		Student2 ref = new Student2();//object creation
		int addresult = ref.add(10, 2);//after add method action,value stored in addresult
		int subresult = ref.sub(10, 2);//stored in subresult
		ref.multi(addresult, subresult);
		
	}

}
