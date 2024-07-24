package org.oopsConcept;

public class ConstractorEx1 {
	
	public ConstractorEx1() {
		this(10,38);
		System.out.println("This is Default constractor");
	}
	
	public ConstractorEx1(int a) {
		System.out.println("This is one para constractor");
	}
	
	public ConstractorEx1(int a, int b) {
		this(20);
		System.out.println("This is Two para constractor");
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		ConstractorEx1 obj = new ConstractorEx1();
		
		System.out.println("Program Ends");
	}

}
