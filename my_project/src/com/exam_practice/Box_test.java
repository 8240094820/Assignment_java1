package com.exam_practice;

public class Box_test {

	public static void main(String[] args) {
		box b1=new box();
		box b2=new box(10);
		box b3=new box(10,20,30);
		b1.cal();
		b2.cal();
		b3.cal();

	}

}
class box{
	double weidth,hight,length;
	
	box(){
		weidth=0;
		hight=0;
		length=0;
	}
	box(double a){
		weidth=a;
		hight=a;
		length=a;
	}
	box(double w, double h, double l){
		weidth=w;
		hight=h;
		length=l;
	}
	void cal() {
		double vol= weidth*hight*length;
		System.out.println("total volume o box is"+vol);
	}
}