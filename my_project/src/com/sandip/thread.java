package com.sandip;

class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Sandip Patra");
		}
		
	}
	
}




class thread{
	public static void main(String args[]) {
		A t=new A();
		t.start();	
		}
}