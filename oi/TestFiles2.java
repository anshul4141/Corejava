package com.raystec.oi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFiles2 {
	
	public static void main(String[] args) throws Exception {
	
		FileReader fr = new FileReader("C:\\Users\\dell\\Desktop\\Concept.txt");
		
		int c = fr.read();          //Create an object integer and hold read method
		
		System.out.println(c);      //This Print By binary
		System.out.println("-----------");
	
		char ch;                    //Create an object of char
		
		while (c != -1) {
			
			ch = (char) c;          //Type cast in char
			System.out.print(ch);
			c=fr.read();
			
		}
		
	}

}
