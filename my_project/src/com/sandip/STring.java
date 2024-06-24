package com.sandip;

public class STring {

	public static void main(String[] args) {
		String str="Sandip";//immutable(can not change)
		int l= str.length();
		System.out.println(l);
		
		
		
		String str2=new String("Sandip");
		int m=str2.length();
		System.out.println(m);
		
		/*if(str==str2) {
			System.out.print("Equal");
		}
		else {
			
		System.out.print("not equal");	
		}
		*/
		if(str.equals(str2)) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not equal");
			
		}
	}

}
