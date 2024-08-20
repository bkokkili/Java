package com.corejava.programs;

class MyCustomException extends Exception {

	private static final long serialVersionUID = 1L;

	MyCustomException(String str) {
		System.out.println(str);
	}
}

public class CustomExceptionEx {

	public static void main(String[] args) {
		
		
		try {
			throw new MyCustomException("Invalid type is provided");
		} catch (Exception e) {

		}
	}

}
