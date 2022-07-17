package com.raystec.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MarksheetBeanExt implements Externalizable {
	
	private String name = "anshul";
	private int maths = 75 ;
	private int phy = 72 ;
	private int chem = 63 ;
	private transient  int temp = 123 ;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(maths);
		out.writeInt(phy);
		out.writeInt(chem);
		out.writeInt(temp);
		
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		maths = in.readInt();
		phy = in.readInt();
		chem = in.readInt();
		temp = in.readInt();
		
		
	}
	public static void main(String[] args) throws Exception {
		
	  FileOutputStream f = new FileOutputStream("C:\\Users\\dell\\Desktop\\file.txt");
	  ObjectOutputStream o = new ObjectOutputStream(f);
	  
	  MarksheetBeanExt m = new MarksheetBeanExt();
	  
	  o.writeObject(m);
	  System.out.println("chal jaa bhai");
	  
	  
	  FileInputStream f1 = new FileInputStream("C:\\Users\\dell\\Desktop\\file.txt");
	  ObjectInputStream o2 = new ObjectInputStream(f1);
	  
	  MarksheetBeanExt m2 = (MarksheetBeanExt) o2.readObject();
	  
	  System.out.println(m2.name);
	  System.out.println(m2.maths);
	  System.out.println(m2.phy);
	  System.out.println(m2.temp);
	  System.out.println("chal to gaya bhai");
	  
	  o2.close();
	  o.close();
		
	}

	

}
