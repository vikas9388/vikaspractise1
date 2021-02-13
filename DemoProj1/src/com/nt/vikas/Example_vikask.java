package com.nt.vikas;

//import java.util.Scanner;

public class Example_vikask {
	/*int a=20,b=30;
	public void m1() {
		int c=a+b;
		System.out.println("The addition of a and b is:"+c);
	}*/
	public static void main(String[] args) {
		
	/*	Example_vikask vik=new Example_vikask();
		vik.m1();
		 Scanner sc=new Scanner(System.in);*/
		int i=1;
	while(i++<=5) {
		try {
			System.out.println("In try");
			continue;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		finally {
			System.out.println("In finally block");
		}
		}}}
	
		 
