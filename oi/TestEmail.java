package com.raystec.oi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestEmail {
	
	public static void main(String[] args) throws Exception {
		
	FileReader s = new FileReader("C:\\Users\\dell\\Desktop\\email.txt") ;
	FileWriter t = new FileWriter("C:\\Users\\dell\\Desktop\\enail11.txt") ;
	
	PrintWriter p = new PrintWriter(t);
	
	Scanner sc = new Scanner(s);
	
	String reg = "^([\\w\\-\\.]+)@((\\[([0-9]{1,3}\\.){3}[0-9]{1,3}\\])|(([\\w\\-]+\\.)+)([a-zA-Z]{2,4}))$";
	
	while (sc.hasNextLine()) {
		String email = (String) sc.nextLine();
		
		if(email.matches(reg)) {
			System.out.println(email);
			p.println(email);
		}
		
		
	}s.close();
	t.close();
	p.close();
	
	System.out.println("Successfully");
	
	
	
	
	
}
	
}
