package com.collection;

import java.util.ArrayList;

public class JavaCollection {
	public static void main(String args[]) {
	ArrayList <String> name= new ArrayList<String>(0);
	
	name.add("Sandip");
	name.add("Patra");
	name.add("Sukanta");
	name.add("Samanta");
	System.out.println(name);
	name.set(1,"Baba");
	System.out.println(name);
	System.out.println(name.get(1));
	name.remove(3);
	System.out.println(name);
	name.clear();
	System.out.println(name);
}
}