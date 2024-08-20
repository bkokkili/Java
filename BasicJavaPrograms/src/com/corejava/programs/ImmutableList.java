package com.corejava.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableList {

	public static void main(String[] args) {
		List<String> list8 = new ArrayList<String>();
		list8.add("INDIA");
		list8.add("AUSTRALIA");
		list8.add("ENGLAND");
		list8.add("NEWZEALAND");
		list8.add("NEWZEALAND");

		List<String> immutableList8 = Collections.unmodifiableList(list8);
		immutableList8.forEach(System.out::println);
		System.out.println();
		List<String> immutableList = List.of("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND");
		immutableList.forEach(System.out::println);
		System.out.println();

		List<String> distinctList = list8.stream().distinct().collect(Collectors.toList());
		distinctList.forEach(System.out::println);
		System.out.println();
		distinctList.stream().forEach(dist -> list8.remove(dist));
		list8.forEach(System.out::println);
	}

}
