package com.raystec.oi;

import java.io.File;
import java.util.Date;

public class TestingFile {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\dell\\Desktop\\git token.txt");
		if (f.exists()) {
			
			System.out.println("Name " + f.getName() );
			System.out.println("Absolute pate " + f.getAbsolutePath());
			System.out.println("Is writable " + f.canWrite());
			System.out.println("Is readable " + f.canRead());
			System.out.println("is File " + f.isFile());
			System.out.println("Is Directory " + f.isDirectory());
			System.out.println("Last Modified at " + new Date(f.lastModified()));
			System.out.println("Length " + f.length() + " bytes long");
			
		}
	}

}
