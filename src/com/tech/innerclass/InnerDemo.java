package com.tech.innerclass;

/*
 * Inner class :- class inside another class is called inner class 
 * 
 *  Based on the purpose and position class is define in 4 types
 *    1:- Normal/regular inner class
 *    2:- Method local inner class
 *    3:- Anonymous inner class
 *    4:- static nested class 
 * */
//4:- accessing inner class code from outer class
public class InnerDemo {

	public static void main(String[] args) {
	  new Outer().new Inner().methodOne();	
	}
}
