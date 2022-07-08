package com.raystech.basic;

public class Exercise17 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8};
		int[] b = { 1, 2, 3, 4, 5, 6 };
		int x = 0;
		int y = 0;
		int miss1 = 0;

		for (int j = 0; j < a.length - 1; j++) {

			x = x + a[j];
			//System.out.println(x);
			

		}
		int y1 = x + a[a.length - 1];
		for (int j : b) {
			y = y + j;
			//System.out.println(y);
		
		}
		miss1 = x - y;
		System.out.println(miss1);

		int miss2 = y1 - y - miss1;
		System.out.print(miss2);

	}

}
