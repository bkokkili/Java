package com.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestProgram {

	public static void main(String[] args) {

		/*
		 * Map<String, Integer> map = new HashMap<>(); map.put("A_text1", 120);
		 * map.put("B_text3", 220); map.put("C_text4", 520); map.put("A_text2", 170);
		 * 
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * List<String> keysList = map.keySet().stream().collect(Collectors.toList());
		 * keysList.forEach(System.out::println); keysList.stream().filter(key ->
		 * key.startsWith("A_")).collect(Collectors.toList());
		 * 
		 * map.forEach((k, v) -> { if (k.startsWith("A_")) { list.add(v); } });
		 * System.out.println(list);
		 */
		
		
		Integer[] words = {10, 20, 40, 10, 25};   

		List<Integer> wordList = Arrays.asList(words);  

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	

}
