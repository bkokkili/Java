package com.corejava.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMapUisngStreams {

	public static void main(String[] args) {
		Map<Integer, String> productsMap = new HashMap<>();

		productsMap.put(1, "HP Laptop");
		productsMap.put(2, "Dell Laptop");
		productsMap.put(3, "Lenevo Laptop");
		productsMap.put(4, "Sony Laptop");
		productsMap.put(5, "Apple Laptop");
		
		//using entry set
		for(Entry<Integer, String> entry: productsMap.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
			
		}
		
		//using keySet
		for(Integer key : productsMap.keySet()) {
			System.out.println(key);
		}
		
		//using keySet
		for(String value : productsMap.values()) {
		    System.out.println(value);
	    }
		
		//using forEach and Lamda
		productsMap.forEach((K, V) -> System.out.println(K +" "+V));
		
		
		//Using Streams
		productsMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		

	}

}
