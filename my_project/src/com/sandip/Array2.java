package com.sandip;

import java.util.Scanner;


public class Array2 {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
				
	}
		//Array2.sort(a);
		System.out.print("Sorted Array element is>>>");
		for(int b: a) {
			System.out.print(b+" ");
		}
	}

	
}
  