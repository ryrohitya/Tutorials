package com.tech.innerclass;

class OuterOne{
	int a = 10;
	class Inner{
		int a = 20;
		public void methodOne() {
			int a = 30;
		System.out.println(" --- "+a);
		System.out.println("===="+this.a);
		System.out.println("::::"+OuterOne.this.a);
		}
	}
}
public class OuterDemo {

	public static void main(String[] args) {
		new OuterOne().new Inner() .methodOne();
	}
}
