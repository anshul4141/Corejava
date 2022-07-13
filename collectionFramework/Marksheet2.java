package com.raystec.collectionFramework;

public class Marksheet2 {
	
	private String rollNo;
	private String fname;
	private String lname;
	private int phy;
	private int chm;
	private int math;
	
	
	public Marksheet2(){
		
	}
	
    public Marksheet2(String r, String f, String l, int p, int c, int m){
    	
    	rollNo = r;
    	fname = f;
    	lname = l;
    	phy = p;
    	chm = c;
    	math = m;
		
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getPhy() {
		return phy;
	}

	public int getChm() {
		return chm;
	}

	public int getMath() {
		return math;
	}

}
