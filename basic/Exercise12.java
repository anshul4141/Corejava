package com.raystech.basic;

public class Exercise12 {
	public static void main(String[] args) {
	    
	    int num = 3553;
	    int reversedNum = 0; 
	    int a;
	    int originalNum = num;
	    
	    
	    while (num != 0) {
	      a = num % 10;
	      reversedNum = reversedNum * 10 + a;
	      num = num / 10;
	    }
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	}


