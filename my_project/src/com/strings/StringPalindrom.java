package com.strings;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a= sc.next();
		String rev="";
		int b=a.length();
		for(int i=b-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not palindrom");
		}

	}

}
