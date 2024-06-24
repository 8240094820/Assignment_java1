package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevarceArray {

	public static void main(String[] args) {
		ArrayList<String> li= new ArrayList<String>();
		li.add("Java");
		li.add("Python");
		li.add("C");
		li.add("C++");
		li.ensureCapacity(7);
		li.add("CD");
		li.add("AI");
		li.add("OS");
		li.add("HTML");
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		

	}

}
