package com.sandip;

public class constructor {

	public static void main(String[] args) {
	a sp=new a();
	sp.display();

	}

}
class a{
	int a; String name;
	a(){                         //constructor
		a=0; name=null;
	}
	void display() {
		System.out.println(a+" "+name);
	}
}