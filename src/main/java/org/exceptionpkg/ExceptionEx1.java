package org.exceptionpkg;

public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		
		int a= 10, b=2;
		try {
			int c = a/b;
			System.out.println("c =" +c);
			
			int[] arr = {28,67,65};
			System.out.println(arr[2]);
			
			String str = "sumeet";
			System.out.println(str.charAt(10));
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	
		System.out.println("Program ends");

	}

}
