package Apti.java;

import java.util.Scanner;

public class Convater {

	public static void main(String[] args) {
		int[] a= {10,20,50,100,500,1000,2000};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int b=sc.nextInt();
		if(b>=2000) 
		{
			if(b==2000) {
				System.out.println("You will give minimum one note");
			}
			else {
				int n=b/2000;
				   
				System.out.println("You will get minimum " +n+ " number of two thound notes ");
			}
	    }
		else if(b>=1000)
		{
			System.out.println("One thousand");
		}
		else if(b>=500) {
			System.out.println("Five hundred");
		}
		else if(b>=100) {
			System.out.println("One hundred");
		}
		else if(b>=50) {
			System.out.println("Fifty");
		}
		else if(b>=20) {
			System.out.println("Twenty");
		}
		else if(b>=10) {
			System.out.println("Ten");
		}
		else {
			System.out.println("Please input valid number");
		}

}
}
