//((((10+2)-2)+2)*2)/2)
package saurabh1;

public class Student3 {
	public int add(int a,int b) {
		int c = a+b;
		System.out.println("The value of c = "+c);
		return c;
	}
	public int sub(int x,int y) {
		int z = x-y;
		System.out.println("The value of z = "+z);
		return z;
	}
	public int multi(int l,int m) {
		int n = l*m;
		System.out.println("The value of n = "+n);
		return n;
	}
	public void div(int p,int q) {
		int r = p/q;
		System.out.println("The value of r = "+r);
	}

	public static void main(String[] args) {
		Student3 ref = new Student3();
		int addresult = ref.add(10, 2);
		int subresult =ref.sub(addresult, 2);
		int addresult1 = ref.add(subresult, 2);
		int multiresult = ref.multi(addresult1, 2);
		ref.div(multiresult, 2);
		
	}

}
