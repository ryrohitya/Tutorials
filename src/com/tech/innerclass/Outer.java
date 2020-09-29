package com.tech.innerclass;
/*
 * Normal or regular inner class
 * 
 * Pints: 
 *      ::method access::
 *  1:- inside inner class we can not declare static members.Hence it
 *      is not possible to write main method inside inner class
 *  2:- we can access inner class code from outer class static method 
 *      main method.
 *  3:- we can access inner class code from instance/non static  area. 
 * 
 *  4:- we can access inner class code from outer class. Like from InnerDEmo class we can 
 *      access inner class method.
 *      
 *      
 *                 ::Member variable  accessing Point
 *  1:- from inner class we can access all var of outer class
 *       
 * */


public class Outer {
	
	// 1:- variable  declaration on outer class 
	int  a = 10;
	static int b = 20; 
	class Inner{
		/*public static void main(String[] args) {
			System.out.println();
		}*/
		
		public void methodOne() {
			System.out.println("Inner class methodOne");
			System.out.println(this.getClass().getName());
			System.out.println(super.getClass().getName());
		}
	}
	// 2:-accessing inner class code from static area
	public static void main(String[] args) {
		Outer  outer = new Outer();
		//Inner inner = outer.new Inner();
		//inner.methodOne();
		outer.access();
	}
	// 3:- accessing inner class code from instance/non static  area.
	public void access() {
		System.out.println("Outer class instance method");
		Inner inner  = new Inner();
		inner.methodOne();
	//  1:- from inner class we can access all variable of outer class
		System.out.println(a);
		System.out.println(b);
	}
	
}
