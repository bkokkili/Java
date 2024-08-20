package com.corejava.programs;

public class IterateArrayUsingStream {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			System.out.println("Average using iteration :" + (sum / arr.length));
	}
	// using Stream

}
