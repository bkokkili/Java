package com.corejava.subpackage;

public class PrimeNumbersExample {

	public static void checkPrime(int n) {
		int m = n / 2;
		System.out.println(m);
		boolean isPrimeNumber = true;

		if (n == 0 || n == 1) {
			isPrimeNumber = false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					isPrimeNumber = false;
				}
			}
		}

		if (isPrimeNumber) {
			System.out.println("Given number is primee number");
		} else {
			System.out.println("Number is not Prime number");
		}

	}

	public static void main(String[] args) {
		PrimeNumbersExample.checkPrime(5);
	}

}
