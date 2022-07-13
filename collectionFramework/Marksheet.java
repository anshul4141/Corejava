package com.raystec.collectionFramework;

public class Marksheet implements Comparable<Marksheet> {
	
	private String rollNo;
	private String fname;
	private String lname;
	private int phy;
	private int chm;
	private int math;
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChm() {
		return chm;
	}
	public void setChm(int chm) {
		this.chm = chm;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return this.rollNo.compareTo(m.rollNo);
	}
	

}
