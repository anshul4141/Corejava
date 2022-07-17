package com.raystec.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	
	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\dell\\Pictures\\Camera Roll\\anshul.jpg";
		String target = "C:\\Users\\dell\\Pictures\\Camera Roll\\anshul2.jpg";
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		
		int ch = reader.read();
		
		while (ch != -1) {
			
		writer.write(ch);
		
		ch = reader.read();
			
			
		}
		
		writer.close();
		reader.close();
		
		System.out.println("Your img is copied");
		
	}

}
