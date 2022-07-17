package com.raystec.io;

import java.io.File;

public class TestFiles3 {
	
	public static void main(String[] args) {
		
		File d = new File("C:\\Eclipse Workspace");
		String[] l = d.list();
		for (String s : l) {
			
			System.out.println(s);
			
		} 
			
			
			
		
}
}
