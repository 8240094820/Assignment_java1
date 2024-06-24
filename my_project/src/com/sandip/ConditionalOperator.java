package com.sandip;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter the three number:");
		Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		d=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(d);

	}

}
