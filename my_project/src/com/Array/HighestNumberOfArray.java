package com.Array;

import java.util.Scanner;

public class HighestNumberOfArray {

	public static void main(String[] args) {
		int arr[]={2,7,1,2,7,3,4,6};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) 
			{
				max=arr[i];
			}
		}
		System.out.println("max is "+max);
		
	}
}
