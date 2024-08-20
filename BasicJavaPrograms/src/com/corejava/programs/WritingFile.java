package com.corejava.programs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("D://read2.txt"))) {
			bw.write("Balaji Kokkiligadda");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
