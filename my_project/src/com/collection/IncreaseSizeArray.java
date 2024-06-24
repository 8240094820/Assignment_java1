package com.collection;

import java.util.ArrayList;
import java.util.List;

public class IncreaseSizeArray {

	public static void main(String[] args) {
		ArrayList<String> li= new ArrayList<String>(3);
		li.add("Java");
		li.add("Python");
		li.add("C");
		li.add("C++");
		System.out.println(li);
		li.ensureCapacity(7);
		li.add("CD");
		li.add("AI");
		li.add("OS");
		li.add("HTML");
		System.out.println(li);
	}

}
