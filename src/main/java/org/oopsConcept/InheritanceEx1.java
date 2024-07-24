package org.oopsConcept;


class Mock{
	
	public void addition(int a,int b) {
		int sum = a+b;
		System.out.println("Sum = " +sum);
	}
	public void multiplication(int r,int s) {
		int multi = r*s;
		System.out.println("Multiplication = " +multi);
	}
}

public class InheritanceEx1  extends Mock{

	public static void main(String[] args) {
		System.out.println("program Starts");
		InheritanceEx1 obj = new InheritanceEx1();
		obj.addition(78, 02);
		obj.multiplication(50, 50);
		System.out.println("program Ends");
	}

}
