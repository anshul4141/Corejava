package com.reystech.oop;

public class ArrayPolymorphism {
	public static void main(String[] args) {
		Shape2[] s1 = new Shape2[3];
		s1[0] = new Rectangle();
		s1[1] = new Triangle();
		s1[2] = new Circle();

		Rectangle r = (Rectangle) s1[0];
		r.setLength(5);
		r.setWidth(5);

		Triangle t = (Triangle) s1[1];
		t.setHeight(5);
		t.setBase(5);
		
		Circle c = (Circle) s1[2];
		c.setRadius(5);
		

		double total = 0.0;
		for (int i = 0; i < s1.length; i++) {

			total = total + s1[i].area();

		}
		System.out.println("Total Area = " + total);

	}

}
