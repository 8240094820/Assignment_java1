package com.sandip;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int a;
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		while(a>=0) {
			
			if(a%2==0) {
				System.out.println("The number is even...");
				break;
			}
			else {
				System.out.println("The number is no enen...");
				break;
			}
			
		}
		
		

	}

}
