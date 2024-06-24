package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {

	public static void main(String[] args) {
		ArrayList<String> li= new ArrayList<String>();
		li.add("Java");
		li.add("Python");
		li.add("C");
		li.add("C++");
		li.add("CD");
		li.add("AI");
		li.add("OS");
		li.add("HTML");
		System.out.println("Before swap:");
		for(String a:li) {
			System.out.println(a);
		}
		Collections.swap(li, 0, 7);
		System.out.println("After swap:");
		for(String b:li) {
			System.out.println(b);
		}

	}

}
