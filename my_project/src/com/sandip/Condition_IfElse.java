package com.sandip;

import java.util.Scanner;

public class Condition_IfElse {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the password: ");
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		
		if (a==1234)
		{
			System.out.println("well done...");
			
			
		}
		else
		{
			System.out.println("wrong password...");
			
		}
		
		

	}

}
