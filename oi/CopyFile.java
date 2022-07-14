package com.raystec.oi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class CopyFile {
	
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\dell\\Desktop\\newtest.txt";
		String target = "C:\\Users\\dell\\Desktop\\newtest2.txt";
		
		FileReader read = new FileReader(source);
		FileWriter write = new FileWriter(target);
		
		int ch = read.read();
		
		while (ch != -1) {
			write.write(ch);
			ch=read.read();
			
		}
		write.close();
		read.close();
		
		System.out.println(source + "is cipied" + target );
		
	}

}
