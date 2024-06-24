package com.collection;

import java.util.LinkedList;

public class Linked_list {

	

	public static void main(String[] args) {
		LinkedList<String> name= new LinkedList<String>();
		name.add("Sandip");
		name.add("Patra");
		name.add("Sukanta");
		name.add("Samanta");
		System.out.println(name);
		
		name.addFirst("Ma");
		name.addLast("Baba");
		System.out.println(name);
		
		for(String str:name) {
			System.out.println(str);
		}

	}

}
