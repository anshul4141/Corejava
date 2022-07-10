package com.raystech.basic;

public class Exercise18 {
public static void main(String[] args) {
	
	int[] arr= {18,17,16,14,5,6,7,8};
	int num=5;
	
	chekNumber(num,arr);
	
}

private static void chekNumber(int num, int[] arr) {
	// TODO Auto-generated method stub
	int temp=-1;
	for(int i=0;i<arr.length;i++) {
	if(num==arr[i]) {
		temp=i;
		break;
	}
	
}

	System.out.println(temp);
}
}
