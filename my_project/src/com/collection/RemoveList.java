package com.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Sandip");
		li.add("Patra");
		li.add("ma");
		li.add("baba");
		System.out.println(li);
		li.remove(1);
		System.out.println(li);
	}

}
