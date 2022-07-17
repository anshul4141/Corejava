package com.raystec.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class PrintByConsole {
	
	public static void main(String[] args) throws Exception {
		
		String s = "C:\\Users\\dell\\Desktop\\Anshul.txt";
		
		FileWriter w = new FileWriter(s);
		
		System.out.println("Start your console");
		
		PrintWriter pw = new PrintWriter(w);
		
		InputStreamReader i = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(i);
		
		String l = br.readLine();
		while (!l.equals("Quit")) {
		pw.println(l);
		l = br.readLine();
		
		}
		pw.close();
		i.close();
		System.out.println("please stop...");
		
	}
	
	
	}
