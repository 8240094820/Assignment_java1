package com.sandip;

public class Student1 {
	int id;
	String name;
	double cgpa;

	 void detl(int i, String n, double c) {
		id=i;
		name=n;
		cgpa=c;
	}
	void display() {
		System.out.println("Id is"+id+"Name is"+name+"CGPA is"+cgpa);
}
}