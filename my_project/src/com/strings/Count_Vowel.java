package com.strings;

import java.util.Scanner;

public class Count_Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			char b=Character.toUpperCase(a);
			if(b=='A'||b=='E'||b=='I'||b=='O'||b=='U') {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
