package com.raystec.io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestEmail {
	
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\dell\\Desktop\\email.txt";
		String target = "C:\\Users\\dell\\Desktop\\enail11.txt";
		
	FileReader s = new FileReader(source) ;
	FileWriter t = new FileWriter(target) ;
	
	PrintWriter p = new PrintWriter(t);
	
	Scanner sc = new Scanner(s);
	
	String reg = "^([\\w\\-\\.]+)@((\\[([0-9]{1,3}\\.){3}[0-9]{1,3}\\])|(([\\w\\-]+\\.)+)([a-zA-Z]{2,4}))$";
	
	while (sc.hasNextLine()) {
		String email = (String) sc.nextLine();
		
		if(email.matches(reg)) {
			System.out.println(email);
			p.println(email);
		}
		
		
	}
	p.close();
	sc.close();
	
	System.out.println("Successfully");
	
	
	// Stephen Cole Kleene
	
	
}
	
}
