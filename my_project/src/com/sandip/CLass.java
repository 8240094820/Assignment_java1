package com.sandip;

public class CLass {

	public static void main(String[] args) {
		person p= new person();
		System.out.println("my age is"+p.age);
		System.out.println("My hight is"+p.hight);
		System.out.println("My colou is"+p.colour);
		
		p.sleep();
		p.eat();
	}

}
class person{
	
	int age=20;
	double hight=5.0;
	String colour="brown";
	
	
	void sleep() {
		System.out.println("I am sleeping...");
	}
	
		
	void eat() {
		
		System.out.println("I am eating...");
	}
}
