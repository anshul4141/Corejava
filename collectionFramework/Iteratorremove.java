package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iteratorremove {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(12);
		l.add(42);
		l.add(20);
		l.add(21);
		
	//	System.out.println(l);
	//	System.out.println(l.get(0));      //This is object type
	//	System.out.println("" + l.get(0)); //This is String type
		
		Iterator it = l.iterator();
	
		while (it.hasNext()) {
			
			Object t = (Object) it.next();
			
			if (t.equals(42)) {
				
				it.remove();
				break;
				
			}
		//	System.out.println(t);
		//	it.remove();
		//System.out.println(ob);
			
			
		}	System.out.println(l);
		
		
		
	}

}
