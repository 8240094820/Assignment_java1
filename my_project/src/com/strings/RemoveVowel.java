package com.strings;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		String s1="";
		s1=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s1);
		
	}

}
