//(((((10*2)-2)-2)+2)*2)/2
package saurabh1;

public class Student4 {
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
		Student4 ref = new Student4();
		int multiresult = ref.multi(10, 2);
		int addresult = ref.add(multiresult, 2);
		int subresult = ref.sub(addresult, 2);
		int subresult1 = ref.sub(subresult, 2);
		int addresult1 = ref.add(subresult1, 2);
		ref.div(addresult1, 2);
		

	}

}
