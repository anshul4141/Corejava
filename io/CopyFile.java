package com.raystec.io;


import java.io.FileReader;
import java.io.FileWriter;


public class CopyFile {
	
	public static void main(String[] args) throws Exception {
		
//		String source = ;
//		String target = ;
		
		FileReader read = new FileReader("C:\\Users\\dell\\Desktop\\newtest.txt");
		FileWriter write = new FileWriter("C:\\Users\\dell\\Desktop\\newtest2.txt");
		
		int ch = read.read();
		
		while (ch != -1) {
			write.write(ch);
			ch=read.read();
			
		}
		write.close();
		read.close();
		
		System.out.println(read + "is cipied" + write );
		
	}

}
