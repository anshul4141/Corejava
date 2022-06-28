package com.raystech.arry;

public class TowDArry {
	public static void main(String[] args) {
		int[][] a = new int [10][9];
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		int[][] b = new int [10][];
		b[0] = new int[9];
		b[1] = new int[19];
		b[2] = new int[29];
		System.out.println(b.length);
		System.out.println(b[0].length);
		for(int[] c : b) {
			System.out.println(c);
		}
	}

}
