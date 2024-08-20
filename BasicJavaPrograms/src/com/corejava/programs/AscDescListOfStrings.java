package com.corejava.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscDescListOfStrings {
	public static void main(String[] args) {
		List<String> productsList = new ArrayList<String>();
		productsList.add("HP Laptop");
		productsList.add("Dell Laptop");
		productsList.add("Lenovo Laptop");
		productsList.add("Sony Laptop");
		productsList.add("Apple Laptop");
		productsList.add("Sony Laptop");
		productsList.add("Dell Laptop");
		
		List<String> sortedList =  productsList.stream().sorted().collect(Collectors.toList());
		List<String> reverseSortedList =  productsList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		System.out.println();
		reverseSortedList.forEach(System.out::println);
		
		
	}

}
