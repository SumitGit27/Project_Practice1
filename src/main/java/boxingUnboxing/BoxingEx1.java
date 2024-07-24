package boxingUnboxing;

public class BoxingEx1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		
		//Explicit Boxing
		int a = 19;
		Integer obj = Integer.valueOf(a);
		System.out.println("a = " +obj);
		
		
		//Implicit Boxing
		int b = 37;
		Integer obj1 = b;
		System.out.println("b = " +obj1);
		
		System.out.println("Program Ends");
	}
}