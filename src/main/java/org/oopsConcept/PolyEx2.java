package org.oopsConcept;

class Demo {
	public void test1(int a) {
		System.out.println("This is method test1");
	}
}

public class PolyEx2 extends Demo {

	public static void main(String[] args) {

		System.out.println("program Starts");
		PolyEx2 pe = new PolyEx2();

		System.out.println("program Ends");
	}

	public void test1(int a) {
		System.out.println("This is method test1");
		System.out.println("Class PolyEx2");
	}

}
