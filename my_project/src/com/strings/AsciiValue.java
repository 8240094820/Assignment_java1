package com.strings;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the character : ");
		char a=sc.next().charAt(0);
		int b=a;
		System.out.println(b);
	}

}
