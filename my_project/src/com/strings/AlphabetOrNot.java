package com.strings;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value : ");
		char b=sc.next().charAt(0);
		if((b>='a' && b<='z') || (b>='A'&& b<='z')) {
			System.out.println("Alphabet");
			
		}else {
			System.out.println("Characer");
		}
	}

}
