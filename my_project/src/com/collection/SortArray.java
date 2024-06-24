package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		List<String> li= new ArrayList<String>();
		li.add("Java");
		li.add("Python");
		li.add("C");
		li.add("C++");
		li.add("CD");
		li.add("AI");
		li.add("OS");
		li.add("HTML");
		System.out.println("Before sort:"+li);
		Collections.sort(li);
		System.out.println("After sort:"+li);

	}

}
