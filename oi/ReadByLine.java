package com.raystec.oi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("C:\\Users\\dell\\Desktop\\Concept.txt");
		BufferedReader br = new BufferedReader(f);
		
		String line = br.readLine();
		
		 System.out.println(line);
		 System.out.println("---------");
		
		while (line != null) {
			
			System.out.println(line);
			
			line = br.readLine();
			
		}
		f.close();
		br.close();
		
	}

}
