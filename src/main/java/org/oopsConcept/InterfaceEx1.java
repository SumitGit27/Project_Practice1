package org.oopsConcept;

interface interf1{
	public void test1();
	public void test2();
}

interface interf2{
	public default void test4() {
		System.out.println("This is test1 interface method");
	}
	public void test3();
}
public class InterfaceEx1  implements interf1,interf2{

	public static void main(String[] args) {
		System.out.println("Program Starts");
		InterfaceEx1 obj = new InterfaceEx1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println("Program Ends");
	}
	public void test1() {
		System.out.println("this is test1");
	}
	public void test2() {
		System.out.println("this is test2");
	}
	public void test3() {
		System.out.println("this is test3");
	}
	public  void test4() {
		System.out.println("This is test1 interface method");
		System.out.println("This is test1 interface method");
	}
	
}
