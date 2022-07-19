package com.raystec.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestApi {
	
	public static void main(String[] args) {
		
        List<String> l = Arrays.asList("one","two","three","four","five","three","eight","one");
		
		Stream<String>st = l.stream();
		
		st.forEach(e -> System.out.println(e));
		System.out.println("______________");
		
		l.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("____Dicide__Limit____");
	
		l.stream().sorted().limit(3).forEach(e -> System.out.println(e));
		System.out.println("__using distinct uniqe elements__");
	
		l.stream().sorted().distinct().forEach(e -> System.out.println(e));
		
//		st.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
	
		
	}

}
