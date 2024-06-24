package com.sandip;

import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		int a,b,c;
		
		System.out.print("Enter two number: ");
		Scanner s= new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		System.out.println("Total sum is:"+c);
	}

}
