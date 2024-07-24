package org.oopsConcept;

public class PolyEx1 {

	public static void main(String[] args) {

     System.out.println("program Starts");
     PolyEx1 pe = new PolyEx1();
     pe.test1();
     pe.test1(10);
     pe.test1(10, 20);
     System.out.println("*******************");
     pe.test2(10,30);
     pe.test2(5,67);
     System.out.println("*******************");
     pe.test3(10,30);
     pe.test3(12,67);
     
     System.out.println("program Ends");
	}
     //method overloading
     //Type1-By changing number of parameters
     
     public void test1() { //0 parameter
    	 System.out.println("This is test 1 method");
     }
     
     public void test1(int a) {  //1 parameter
    	 System.out.println("This is test 1 method");
     }
     
     public void test1(int a,int b) {  //2 parameter
    	 System.out.println("This is test 1 method");
     }
    
     //Type1-By changing type of parameters
     
     public void test2(int a,int b) {
    	 System.out.println("This is test 2 method");
     }
     
     public void test2(short a,long b) { 
    	 System.out.println("This is test 2 method");
     }
    
     //Type1-By changing position of parameters
     public void test3(int a,double b) {
    	 System.out.println("This is test 3 method");
     }
     
     public void test3(short a, int b) { 
    	 System.out.println("This is test 3 method");
     }

}


