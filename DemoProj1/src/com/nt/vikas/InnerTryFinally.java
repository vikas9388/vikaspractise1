package com.nt.vikas;

public class InnerTryFinally {

	public static void main(String[] args) {
		System.out.println("Before OT");
		
	try {
		System.out.println("In OT");
		try {
			System.out.println("In IT");
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("In IC");
		}
		finally {
			System.out.println("In IF");
		}
		System.out.println("After IF");
	}
	catch(ArithmeticException e) {System.out.println("In OC");}
	finally {System.out.println("In OF");}
	System.out.println("After OF");
	}

}
