package boxingUnboxing;

public class UnboxingEx1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//Explicit Unboxing
		Integer obj = Integer.valueOf(56);
		int a = obj.intValue();
		System.out.println("value of a =" +a);
		
		//implicit Unboxing
		Integer obj1 = Integer.valueOf(32);
		int b = obj1;
		System.out.println("value of b = "+b);
		
		System.out.println("Program Ends");

	}

}
