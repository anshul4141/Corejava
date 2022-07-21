package com.raystec.io;

import java.io.File;

public class TestFile4 {
	
	public static void main(String[] args) {
		
		File directory = new File("C:\\Eclipse Workspace");
		
		String[] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File f = new File("C:\\Eclipse Workspace", list[i]);
			
			if(f.isFile()) {
			
			System.out.println(list[i]);
			}
		}
		
	}

}
