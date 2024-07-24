package org.oopsConcept;


class Mock2{
	public Mock2() {
		System.out.println("This is Default constractor");
	}
	
	public Mock2(double d) {
		this();
		System.out.println("This is one para double constractor");
	}
}


public class ConstractorEx2 extends Mock2{
	
	public ConstractorEx2() {
		this(10,38);
		System.out.println("This is Default constractor");
	}
	
	public ConstractorEx2(int a) {
		super(28.67);
		System.out.println("This is one para constractor");
	}
	
	public ConstractorEx2(int a, int b) {
		this(20);
		System.out.println("This is Two para constractor");
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		ConstractorEx2 obj = new ConstractorEx2();
		
		System.out.println("Program Ends");
	}

}
