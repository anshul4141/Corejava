package com.raystec.oi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWtire {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter w = new FileWriter("C:\\Users\\dell\\Desktop\\newtest.txt", true);
		PrintWriter p = new PrintWriter(w);
		
		//for (int i = 0; i < 10; i++) {
			
		//	p.println(i+ ":Line");
		
		p.println("prajapati");
		p.println("prajapati");
		p.println("prajapati");
		p.println("prajapati");
			
		
			
			
			
		p.close();
		w.close();
		
		System.out.println("Please check The File");
		
	}

}
