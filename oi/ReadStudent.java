package com.raystec.oi;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadStudent {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\Student.txt");
		ObjectInputStream os = new ObjectInputStream(file);
		
		Student s = (Student)os.readObject();
		
		System.out.println("Name : " + s.getfName());
		System.out.println("LName : " + s.getlName());
		System.out.println("Address : " + s.getAddress());
		System.out.println("Age : " + s.getAge());
		
	}

}
