package org.oopsConcept;

abstract class Demo1 {
	// Abstract methods
	abstract public void test1();

	abstract public void test2();
}

abstract class Demo2 {
	// concrete methods
	public void test1() {
		System.out.println("method test1");
	}

	public void test2() {
		System.out.println("method test2");
	}
}

abstract class Demo3 {
	// combination of Abstract method & concrete methods
	abstract public void test1();

	public void test2() {
		System.out.println("method test2");
	}
}

public class AbstarctionEx1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");

		System.out.println("Program Ends");
	}
}
