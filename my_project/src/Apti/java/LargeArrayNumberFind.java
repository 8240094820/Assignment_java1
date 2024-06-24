package Apti.java;

public class LargeArrayNumberFind {
	public static void main(String args[]) {

	int arr[]={12,23,34,45,56,123,432,256,3,5,77};
	
	
	int max =arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max < arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);
	}

}
