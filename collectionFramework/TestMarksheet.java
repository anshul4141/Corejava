package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();


		m1.setRollNo("5");
		m1.setFname("Arun");
		m1.setLname("Mandloi");
		m1.setPhy(45);
		m1.setChm(54);
		m1.setMath(45);

		Marksheet m2 = new Marksheet();

		m2.setRollNo("2");
		m2.setFname("Anshul");
		m2.setLname("Prajapati");
		m2.setPhy(72);
		m2.setChm(64);
		m2.setMath(68);

		Marksheet m3 = new Marksheet();

		m3.setRollNo("4");
		m3.setFname("Jayati");
		m3.setLname("Chouhan");
		m3.setPhy(33);
		m3.setChm(33);
		m3.setMath(33);

		Marksheet m4 = new Marksheet();

		m4.setRollNo("1");
		m4.setFname("Aryant");
		m4.setLname("Sharma");
		m4.setPhy(54);
		m4.setChm(62);
		m4.setMath(52);

		Marksheet m5 = new Marksheet();

		m5.setRollNo("3");
		m5.setFname("Vishwas");
		m5.setLname("Sharma");
		m5.setPhy(62);
		m5.setChm(82);
		m5.setMath(92);

		ArrayList l = new ArrayList<>();
		
		Orderbyfname f = new Orderbyfname();   //Short By first name

		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);

		Collections.sort(l);

		Iterator it = l.iterator();

		while (it.hasNext()) {

			Marksheet m = (Marksheet) it.next();

			System.out.println(m.getRollNo() + " " + m.getFname() + " " + m.getLname() + " " + m.getPhy() + " "
					+ m.getChm() + " " + m.getMath());

		}

	}

}
