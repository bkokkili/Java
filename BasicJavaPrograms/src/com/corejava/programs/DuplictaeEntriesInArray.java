package com.corejava.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplictaeEntriesInArray {

	public static void main(String[] args) {
		Integer[] words = {10, 20, 40, 10, 25, 24, 65};   

		 List<Integer> myList = Arrays.asList(words);
         Set<Integer> set = new HashSet();
         myList.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);
	}

}
