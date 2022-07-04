package com.raystec.oopexercise;

public final class ClassImmutable {
	private final String name;
	private final int age;
	public ClassImmutable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		ClassImmutable a = new ClassImmutable("Anshul", 20);
		
		System.out.println("Name = " + a.getName());
		System.out.println("-------------");
		System.out.println("Age = " + a.getAge());
	}
	
	
	
	
	}
