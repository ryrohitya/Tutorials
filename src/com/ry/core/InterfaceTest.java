package com.ry.core;

public class InterfaceTest implements A,B {

	public static void main(String[] args) {
		InterfaceTest test = new InterfaceTest();
		test.m1();
		A.m2();
		B.m2();
		test.m3();
	}

	@Override
	public void m1() {
		A.super.m1();
		B.super.m1();
	}

	@Override
	public void m3() {
		System.out.println("from abstract method");
	}
}
