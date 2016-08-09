package com.people;

public class Student extends Person{
	private String studentID  = null;
	private boolean hasCoffee = false;
	private boolean inClassroom = false;
	private boolean payingAttention = false;
	
	public Student(String name, int age, String gender, float height, String studentID, boolean hasCoffee,
			boolean inClassroom, boolean payingAttention) {
		super(name, age, gender, height);
		this.studentID = studentID;
		this.hasCoffee = hasCoffee;
		this.inClassroom = inClassroom;
		this.payingAttention = payingAttention;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public boolean isHasCoffee() {
		return hasCoffee;
	}

	public void setHasCoffee(boolean hasCoffee) {
		this.hasCoffee = hasCoffee;
	}

	public boolean isInClassroom() {
		return inClassroom;
	}

	public void setInClassroom(boolean inClassroom) {
		this.inClassroom = inClassroom;
	}

	public boolean isPayingAttention() {
		return payingAttention;
	}

	public void setPayingAttention(boolean payingAttention) {
		this.payingAttention = payingAttention;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", hasCoffee=" + hasCoffee + ", inClassroom=" + inClassroom
				+ ", payingAttention=" + payingAttention + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", height=" + height + "]";
	}
	
	

}
