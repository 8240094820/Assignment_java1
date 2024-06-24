package com.sandip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex {
	
	public static void main(String[] args) {
		
		List<Integer>  list= new ArrayList<Integer>();
	
		
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(2);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(65);
		list.add(44);
		list.add(445);
		list.add(1);
		System.out.println(list);
		
	    Collections.sort(list);
	    
	    System.err.println(list);
	    
	  
	    
	    for(int a :list) {
	    	System.out.println("my elements->"+a);
	    }
	    
	    list.clear();
		
	    for(int i = 0; i<list.size(); i++) {
	    	System.out.println("1 my elements->"+list.get(i));
	    }
		
		
		
	}

}
