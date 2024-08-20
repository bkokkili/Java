package com.corejava.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0; int num2=1;
		int counter =0; int n =10;
		
		while(counter < n) {
			System.out.print(num1);
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter +1 ;
		}

	}

}
