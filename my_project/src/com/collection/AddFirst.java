package com.collection;

import java.util.*;

public class AddFirst {
	public static void main(String args[]) {
	
		List<String> li=new ArrayList<String>();
		li.add("Sandip");
		li.add("Patra");
		System.out.println(li);
		li.add(0,"my name is");
		System.out.println(li);
	}
}
