package com.corejava.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingFile {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("D://read1.txt"))) {
			String line = br.readLine();
			
			List<String> finalList = new ArrayList<>();

			while (line != null) {
				String[] str = line.split(",");
				List<String> list = Arrays.asList(str);
				finalList.addAll(list);
				line = br.readLine();
			}
			
			List<String> distinctList = finalList.stream().distinct().collect(Collectors.toList());
			
			//convert List of Strings to List of Integers
			List<Integer> intList = distinctList.stream().map(Integer::parseInt).collect(Collectors.toList());
			
			intList.forEach(intLi ->System.out.println(intLi));
			distinctList.forEach(li -> System.out.println(li));
		 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
