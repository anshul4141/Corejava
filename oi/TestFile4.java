package com.raystec.oi;

import java.io.File;

public class TestFile4 {
	
	public static void main(String[] args) {
		
		File directory = new File("C:\\Eclipse Workspace");
		
		String[] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			
			File f = new File("C:\\Eclipse Workspace", list[i]);
			
			if(f.isFile()) {
			
			System.out.println((i+1)+ " : " +list[i]);
			}
		}
		
	}

}
