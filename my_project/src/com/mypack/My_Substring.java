package com.mypack;

import java.util.ArrayList;

public class My_Substring {

	
	public static void main(String[] args) {
		String myString="mynameissandippatra";
		int k =0;
		int len = myString.length();
		for(int i=0;i<len;i=i+3) {
			k=i+3;
			if(k<=len)
		    System.out.println(myString.substring (i,k));
		ArrayList<String> arr	= new ArrayList<String>();
			arr.add(myString.substring (i,k));
			System.out.println(arr);   
		}
	}
}
