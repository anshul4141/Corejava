package com.raystech.basic;

public class Pyramit {
     public static void main(String[] args) {
		    int a = 5;
            int b = 0;
		    for (int i = 1; i <= a; i++, b = 0) {
		      for (int space = 1; space <= a - i; space++) {
		        System.out.print("  ");
		      }

		      while (b != 2 * i - 1) {
		        System.out.print("* ");
		        ++b;
		      }

		      System.out.println();
		    }
		  }
		}


