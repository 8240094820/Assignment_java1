package com.sandip;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,ch,c;
		System.out.println("Enter the two number::");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice:");
		
		ch=sc.nextInt();
		
		switch(ch) {
		case 1: c=a+b;
		System.out.println("Addition: "+c);
		break;
		case 2: c=a-b;
		System.out.println("Substaction: "+c);
		break;
		case 3: c=a*b;
		System.out.println("Multiply: "+c);
		break;
		case 4: c=a/b;
		System.out.println("Division: "+c);
		break;
		case 5: c=a%b;
		System.out.println("Modulu: "+c);
		break;
		default:
			System.out.println("Plese enter valid ...");

			
		
		}
		
		
		
		
		
	}

}
