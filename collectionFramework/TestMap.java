package com.raystec.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new LinkedHashMap();    // Map is not true collection
		
		m.put(1, "C");
		m.put(2, "C++");
		m.put(3, "Anshul");
		m.put(4, 25);
		
		System.out.println(m); 
		System.out.println("-----------------");
		System.out.println(m.size());
		System.out.println("-----------------");
        m.put(5, 'A');
		System.out.println(m);
		System.out.println("-----------------");
		System.out.println(m.size());
		System.out.println("-----------------");
		System.out.println(m.isEmpty());
		System.out.println("-----------------");
		System.out.println(m.keySet());
		System.out.println("-----------------");
		System.out.println(m.values());
		System.out.println("-----------------");
		m.remove(3);
		System.out.println(m);
		System.out.println("-----------------");
		m.clear();
		System.out.println(m);
	}

}
