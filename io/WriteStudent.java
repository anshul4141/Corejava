package com.raystec.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteStudent {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\dell\\Desktop\\Student.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		
		Student s = new Student("Anshul","Prajapati","Indore",21);		
		
		os.writeObject(s);
		os.close();
		
		System.out.println("Successfully");
	}

}
