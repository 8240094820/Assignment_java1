package com.sandip;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int i,num;
		
		System.out.println("Enter the number:");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			
			System.out.println(num*i);
		}
		
		
	}

}
