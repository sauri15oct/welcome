package saurabh1;

public class Glo {
	int saurabh;// global variable
	public void m1(int saurabh) {//local variable=saurabh
		this.saurabh = saurabh;
	}
	public static void main(String[] args) {
		Glo obj = new Glo();
		obj.m1(12);
		System.out.println("value of saurabh = "+obj.saurabh);
	}

}
/* use of this keyword -- 3 -when the name of local and global
 * variable are same,then we use this keyword to 
 * differentiate----concept is called data shadowing.*/
