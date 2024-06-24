package com.strings;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character : ");
		char b=sc.next().charAt(0);
		char c=Character.toUpperCase(b);
		if( c=='A' || c=='E' || c=='I' || c=='O'|| c=='U') {
		   System.out.println("Vowel");
		}else {
			System.out.println("Consonante");
		}
	}

}
