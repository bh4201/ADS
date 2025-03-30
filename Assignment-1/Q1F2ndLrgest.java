/*
roblem 1: Given an array of integers, perform the following operations:
1. Find the second largest element in the array.
2. Move all zeros to the end of the array while maintaining the order of non-zero elements.
Input: arr = [10, 0, 5, 20, 0, 8, 15]
Output:
Second largest element: 15
Array after moving zeros: [10, 5, 20, 8, 15, 0, 0]
*/
class Q1F2ndLrgest{
public static void main(String[] a){

	int arr[] = {10, 0, 5, 20, 0, 8, 15};
	int n= arr.length;
	int temp[] = new int[n];
	int j=0;
	
	int fmax =0;
	int smax =0;
	for(int i=0; i<n-1;i++){
		if(arr[i] > fmax){
			fmax=arr[i];
		}
	}
	for(int i=0; i<n-1;i++){
		if(arr[i] > fmax  && arr[i]!=smax){
			smax=arr[i];
		}
	}
	System.out.println("Largest element is "+smax);
	
	for(int i=0; i<n;i++){
		if(arr[i]!=0){
			temp[j++]=arr[i];
		}
	}
	System.out.print("Array after moving zeros: ");
	for(int x : temp){
		System.out.print(x+", ");
	}
	System.out.println();
	/* int fmax =0; 
	for(int i=0; i<n-1;i++){
		if(arr[i] > arr[i+1]){
			fmax=arr[i];
		}
	}
	System.out.println("Largest element is "+fmax);*/
	
	 


}

}