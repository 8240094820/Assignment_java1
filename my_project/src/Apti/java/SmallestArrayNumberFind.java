package Apti.java;

public class SmallestArrayNumberFind {

	public static void main(String[] args) {
		int arr[]= {4,22,3,6,8,10,4,7,3,43,222,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]){
				min=arr[i];
			}
			
		}
		System.out.println(min);
	}

}
