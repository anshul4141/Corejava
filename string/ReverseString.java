package com.raystech.string;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		char[] resultarray = name.toCharArray();
		
		for(int a = resultarray.length - 1; a >=0; a--) {
		System.out.print(resultarray[a]);
		
	}
		

}


}
