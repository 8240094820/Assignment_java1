package com.strings;

import java.util.Scanner;

public class RevarceString {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name : ");
	  String str=sc.next();
	  String rev="";
	  int a=str.length();
	  for(int i=a-1;i>=0;i--) {
		  rev=rev+str.charAt(i);
	  }
	  System.out.println(rev);
}
}