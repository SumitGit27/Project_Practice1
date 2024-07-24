package org.oopsConcept;

class Data {
	
	private int a,b;
	
	public int getA() {
		return a;
	}
	
    public int getB() {
		return b;
	}
    
    public void setA(int a) {
    	this.a = a;
    }
    
    public void setB(int b) {
    	this.b = b;
    }
	
}
public class EncapsulationEx1 {

	public static void main(String[] args) {

     System.out.println("Program Starts");
     Data dt = new Data();
     System.out.println("value of A =" +dt.getA());
     System.out.println("value of B =" +dt.getB());
     dt.setA(40);
     dt.setB(87);
     System.out.println("*******************************");
     System.out.println("value of A =" +dt.getA());
     System.out.println("value of B =" +dt.getB());
     System.out.println("Program Ends");

	}

}
