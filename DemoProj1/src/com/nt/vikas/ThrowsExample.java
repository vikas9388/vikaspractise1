package com.nt.vikas;

public class ThrowsExample {

	static int m1(int p) throws IllegalArgumentException {
		if(p<=0){throw new IllegalArgumentException("Do not pass -ve values");}
		return p;
	}
	public static void main(String[] args) {
		System.out.println(m1(-5));
	}
}


