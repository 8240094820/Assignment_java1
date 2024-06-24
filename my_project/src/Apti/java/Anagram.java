package Apti.java;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String s1="123";
		String s2="321";
		
		String a=s1.toLowerCase();
		String b=s2.toLowerCase();
		if(a.length()== b.length())
		{
		 char a1[]=a.toCharArray();
		 char b1[]=b.toCharArray();
		 Arrays.sort(a1);
		 Arrays.sort(b1);
		 
		 if(Arrays.equals(a1, b1)) {
			 System.out.println("Anagram");
		 }
		 else {
			 System.out.println("Not Anagram");
		 }
		}  
		else 
		{
			System.out.println("not same length");
		}
	}

}
