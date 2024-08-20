package com.corejava.programs;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(10);
		System.out.println("No Parameterized Constructor/Default Constructor");
	}

	public ConstructorChaining(int i) {
		this(10, 20);
		System.out.println("Single Parameterized Constructor");
	}

	public ConstructorChaining(int i, int j) {
		System.out.println("two Parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining constructorChaining = new ConstructorChaining();
		constructorChaining.hashCode();
	}

}
