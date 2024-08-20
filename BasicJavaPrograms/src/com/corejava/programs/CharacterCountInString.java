package com.corejava.programs;

public class CharacterCountInString {

	public static void main(String[] args) {
		String countString = "Balaji";
		int count = 0;

		//Use String.length() to Count Total Characters in a Java String
		System.out.println("String total count "+ countString.length());
		
		//Use Loop and charAt() to Count a Specific Character in a Java String
		for (int i = 0; i < countString.length(); i++) {
			count++;
		}
		System.out.println(" count "+count);
		
		//Use Java 8 Stream to Count Characters in a Java String
		long totalCharacters = countString.chars().filter(ch -> ch != ' ').count();
		System.out.println("Count using Streams API " +totalCharacters);
		System.out.println(countString.chars().filter(ch -> ch != ' ').count());
		
		
	}
}
