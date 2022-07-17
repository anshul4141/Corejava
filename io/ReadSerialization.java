package com.raystec.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerialization {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\Serialization.ser");
		ObjectInputStream out = new ObjectInputStream(file);
		
		Employee tsl = (Employee)out.readObject();
		
		System.out.println("ID : " + tsl.getId());
		System.out.println("F Name : " + tsl.getfName());
		System.out.println("L Name : " + tsl.getlName());
		System.out.println("Password : " + tsl.getPas());
		
	}

}
