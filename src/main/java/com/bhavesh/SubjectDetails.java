package com.bhavesh;

public class SubjectDetails {
	String subjectCode;
	String name;
	int internalMarks;
	int externalMarks;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInternalMarks() {
		return internalMarks;
	}
	public void setInternalMarks(int internalMarks) {
		this.internalMarks = internalMarks;
	}
	public int getExternalMarks() {
		return externalMarks;
	}
	public void setExternalMarks(int externalMarks) {
		this.externalMarks = externalMarks;
	}
	@Override
	public String toString() {
		return "SubjectDetails [subjectCode=" + subjectCode + ", name=" + name + ", internalMarks=" + internalMarks
				+ ", externalMarks=" + externalMarks + "]";
	}
	
	
	
}
