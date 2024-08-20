package com.corejava.subpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharactersCountFromStrin {
	// Using normal approach
	public static void countDuplicate(String str) {

		Map<Character, Integer> countMap = new HashMap<>();

		char[] charString = str.toCharArray();

		for (Character ch : charString) {
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String string = "StorageResourceManagement";
		CharactersCountFromStrin.countDuplicate(string);

		// Using Stream
		Map<Character, Long> map = string.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		map.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + " : " + v);
			}
		});

	}

}
