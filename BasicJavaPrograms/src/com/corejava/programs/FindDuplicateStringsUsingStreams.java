package com.corejava.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateStringsUsingStreams {

	public static void main(String[] args) {
		List<String> productsList = new ArrayList<String>();
		productsList.add("HP Laptop");
		productsList.add("Dell Laptop");
		productsList.add("Lenovo Laptop");
		productsList.add("Sony Laptop");
		productsList.add("Apple Laptop");
		productsList.add("Sony Laptop");
		productsList.add("Dell Laptop");
		
		//print list using forEach() method
		productsList.forEach(System.out :: println);
		
		
		//print original List
		productsList.forEach(productName -> System.out.println("Product Name: " + productName));

		//get unique elements after removing duplicates
		List<String> distinctProductNameList = productsList.stream().distinct().sorted().collect(Collectors.toList());

		//print unique  elements
		distinctProductNameList
				.forEach(uniqueProductName -> System.out.println("Distinct Product Name: " + uniqueProductName));

		//removes all items from productsList that are present in distinctProductNameList
		distinctProductNameList.forEach(productsList::remove);

		//print duplicate elements
		productsList.forEach(duplicateName -> System.out.println("Duplicate Names " + duplicateName));

	}

}
