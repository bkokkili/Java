package com.corejava.subpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortAndLimitEx {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add(i);
		}
		System.out.println(nums.size());

		List<Integer> oddList = nums.stream().filter(num -> num % 2 != 0).limit(10).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		oddList.forEach(System.out::println);
	}

}
