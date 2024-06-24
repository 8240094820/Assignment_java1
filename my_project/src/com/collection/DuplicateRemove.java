package com.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

class DuplicateRemove{  
 public static void main(String args[]){  
	 String input[] = {"abc", "cde", "efg", "abc", "xyz", "tfg", "xyz"};
	 List a = Arrays.asList(input);
	 System.out.println(a);
	 LinkedHashSet<String> linkedArray = new LinkedHashSet<String>(a);
	 System.out.println(linkedArray);
	 String[] output = new String[linkedArray.size()];
	 output = linkedArray.toArray(output);
	 
	 //System.out.println(Arrays.toString(output));
 }  
}  