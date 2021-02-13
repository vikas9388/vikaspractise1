package com.nt.vikas;
class InvalidAgeException1 extends Exception{
	InvalidAgeException1(String s){
		super();
	}	
}
public class ExceptionTest2 {
	static void Validate(int age) throws InvalidAgeException1{
		if(age<18) {System.out.println("Cant vote");}
		else {System.out.println("Can vote");}
			
		}
	public static void main(String[] args) {
		try {Validate(20);}
		catch (InvalidAgeException1 m){System.out.println("Exception occured");}
			
		}

	}


