package org.oopsConcept;

interface inter{
	public void demo1();
	public void demo2(int a);
	public static void demo3() {
		System.out.println("demo3");
	}
}

public class AnnonimousEx1{

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		inter obj = new inter() {
			public void demo1() {
				System.out.println("this is demo1");
			}
			public void demo2(int a) {
				System.out.println("this is demo2");
			}
		};
		obj.demo1();
		obj.demo2(89);
		System.out.println("Program Ends");
	}
}
