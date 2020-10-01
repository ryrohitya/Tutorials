package com.ry.core;

public interface B {
	public default void m1() {
		System.out.println("Interface m1 from B");
	}
	public static void m2() {
		System.out.println("static method from m1");
	}
	public abstract void m3();
	public default void m4() {
		System.out.println("This is new default methhod");
	}
}
