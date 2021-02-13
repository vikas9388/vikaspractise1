package com.nt.vikas;

class Animal {
   public void moove() {
	      System.out.println("Animals can move");
	   }
	}
	class Dog extends Animal {
	   public void moove() {
	      System.out.println("Dogs can walk and run");
	   }
	}
	public class TestDog {
	   public static void main(String args[]) {
	      Animal a = new Animal(); // Animal reference and object
	      Animal b = new Dog(); // Animal reference but Dog object
	      a.moove(); // runs the method in Animal class
	      b.moove(); // runs the method in Dog class
	   }
}