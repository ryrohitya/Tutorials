package com.ry.core;
/*
  This file is changed !
*/
public interface A {
	public default void m1() {
		System.out.println("Interface m1 from A");
	}
	public static void m2() {
		System.out.println("static method from m1");
	}
	public abstract void m3();
}
