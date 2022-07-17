package com.raystec.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WritePeimitive {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\dell\\Desktop\\Primitive.dat");
		DataOutputStream d = new DataOutputStream(f);
		
		d.writeInt(7);
		d.writeDouble(5.2);
		d.writeLong(800000000);
		d.writeBoolean(true);
		d.writeChar('A');
		
		d.close();
		System.out.println("Your data has been written");
		
	}

}
