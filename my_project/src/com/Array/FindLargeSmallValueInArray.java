package com.Array;

public class FindLargeSmallValueInArray {

	public static void main(String[] args) {
		int arr[]= {23,34,41,26,74,23,45,85,23};
		
		int max=arr[0]; int min=arr[0];
		
		for(int i=0;i<arr.length;i++) 
		{
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("max is "+max+" min is "+min);
	}

}
