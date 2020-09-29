package com.tech.methodlocalinner;

public class Test {
	static int x = 300;
    int a = 4000;
	public static  void methodOne() {
		class Inner{
			public  void sum(int x,int y) {
				System.out.println(Test.x);
				//System.out.println(a); non static value can not accessed
				System.out.println("Addition is:: "+(x+y));
			}
		}
		Inner inner = new Inner();
		inner.sum(10, 20);
		inner.sum(100, 1000);
		inner.sum(1000, 10000);
	}
	public static void main(String[] args) {
		new Test().methodOne();
		
	}
}
