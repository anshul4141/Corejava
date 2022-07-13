package com.raystec.oi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFiles2 {
	
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\dell\\Desktop\\Concept.txt");
		FileReader fr = new FileReader(f);
		
		int c = fr.read();
		
		char ch;
		
		while (c != -1) {
			
			ch = (char) c;
			System.out.print(ch);
			c=fr.read();
			
		}
	}

}
