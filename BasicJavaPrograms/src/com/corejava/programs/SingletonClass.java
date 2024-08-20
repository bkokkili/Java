package com.corejava.programs;

public class SingletonClass implements Cloneable {

	private static SingletonClass instance = null;

	private SingletonClass() {
	}

	private static synchronized SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}

	//to prevent singleton pattern from cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) {
		System.out.println("HashValue " + getInstance().hashCode());
		System.out.println("HashValue1 " + getInstance().hashCode());
		try {
			System.out.println("HashValue2 " + getInstance().clone().hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
