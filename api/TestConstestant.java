package com.raystec.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestConstestant {
	
	public static void main(String[] args) {
		
		List<Constestant> list = new ArrayList<Constestant>();
		
		list.add(new Constestant("Anshul", "9669330519"));
		list.add(new Constestant("Arun",   "9912342222"));
		list.add(new Constestant("Anshul", "9669330519"));
		list.add(new Constestant("Pratik", "9987563254"));
		list.add(new Constestant("Jayati", "9963524879"));
		list.add(new Constestant("InvalidNo","54875687"));
		
		System.out.println("get only phone number");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));
		System.out.println("__________________");
		
		System.out.println("get valid phone number");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));
		System.out.println("__________________");
		
		System.out.println("Remove dublicat phone no.");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10)
		.distinct().forEach(e -> System.out.println(e));
		System.out.println("__________________");
		
		System.out.println("Shuffle phone number");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10)
		.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).forEach(e -> System.out.println(e));
		System.out.println("__________________");
		
		System.out.println("winner winner chikan dinnar");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10)
		.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e -> System.out.println(e));
		System.out.println("___finish!!!......");
		
	}

}
