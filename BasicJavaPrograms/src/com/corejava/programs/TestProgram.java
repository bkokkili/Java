package com.corejava.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestProgram {
	static boolean check;
	public static void main(String[] args) {
		
		List<String> listString =  new ArrayList<>();
		listString.add("Balaji");
		listString.add("Ankit");
		listString.add("Thalli");
		listString.add("Chitti");
		listString.forEach(li -> System.out.println("Before Sort " +li));
//		Collections.sort(listString);
		System.out.println();
		List<String> sortedList = listString.stream().sorted().collect(Collectors.toList());
		sortedList.stream().forEach(sort-> System.out.println("After Sort " +sort));
	}
	
	
}
