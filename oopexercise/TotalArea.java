package com.raystec.oopexercise;

public class TotalArea {
	
	public static void main(String[] args) {
		
		Shape[] s1 = new Shape[3];
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
			double d = s1[i].area();
			System.out.println(d); 
			total = total + s1[i].area();
        }
		System.out.println("{Total Area} = " + total);
		}
}

