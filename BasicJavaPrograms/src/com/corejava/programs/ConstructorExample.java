package com.corejava.programs;

public class ConstructorExample {

	int a;
	int b;

	// Parameterized constructor
	ConstructorExample(int a, int b) {
		System.out.println("Parameterized constructor");
		this.a = a;
		this.b = b;
	}
	ConstructorExample(){
		this(10,20);
		System.out.println("Deafult constructor");
	}

	void display() {
		// Displaying value of variables a and b
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		ConstructorExample object = new ConstructorExample(10, 20);
		System.out.println(object);
		
	}

}
