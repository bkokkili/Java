package com.corejava.programs;

public interface InterfaceEx {
	
	public default void m1() {
		System.out.println("m1 methd");
	}
}

@FunctionalInterface 
interface Child extends InterfaceEx { 
    public int childMethod(); 
}
