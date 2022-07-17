package com.raystec.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteSerialization {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\dell\\Desktop\\Serialization.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee tsl = new Employee(10,"Anshul","Prajapati", "anshul@1234");
		
		out.writeObject(tsl);
		System.out.println("Please Check File");
		out.close();
		
		
		
		}

}
