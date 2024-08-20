package com.corejava.programs;

interface A {
	void A1();
	void A2();
}

interface B {
	void B1();
	void B2();
}

interface C extends A, B {

}

abstract class One{
	abstract void A();
}

public class InterfaceAbstractEx {

}
