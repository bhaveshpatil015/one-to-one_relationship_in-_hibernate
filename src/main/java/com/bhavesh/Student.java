package com.bhavesh;

import java.util.HashSet;
import java.util.Set;

public class Student {
	int rollNo;
	String fname;
	String lname;
	Address addr;
	Set<SubjectDetails> subjects = new HashSet<SubjectDetails>();
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Set<SubjectDetails> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<SubjectDetails> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", addr=" + addr + ", subjects="
				+ subjects + "]";
	}
	
	
	

}
