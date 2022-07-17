package com.raystec.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadPrimitive {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("C:\\Users\\dell\\Desktop\\Primitive.dat");
		DataInputStream d = new DataInputStream(f);
		
		System.out.println(d.readInt());
		System.out.println(d.readDouble());
		System.out.println(d.readLong());
		System.out.println(d.readBoolean());
		System.out.println(d.readChar());
		
		d.close();
		
		
	}

}
