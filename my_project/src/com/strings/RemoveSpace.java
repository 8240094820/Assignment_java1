package com.strings;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sentence : ");
		String s=sc.nextLine();
	    String s1="";
	    s1=s.replaceAll(" ", "");
	    System.out.println(s1);
	}

}
