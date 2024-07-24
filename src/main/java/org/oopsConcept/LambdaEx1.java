package org.oopsConcept;

interface inter1{
	public void demo1();
}

public class LambdaEx1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		inter1 obj =()->{
				System.out.println("This is Demo1");
		};
		obj.demo1();
	
		System.out.println("Program Ends");

	}

}
