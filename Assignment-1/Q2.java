/*
*/import java.util.*;
class Q2{
	public static int serach(int arr[],int target){
		int start =0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(arr[mid]==target){
				
				return mid;
			}
			else if(arr[mid]<target){
				start = mid+1;
			}
			else
				end = mid -1;
			
		}
		return -1;
	
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}; 
		
		System.out.println("your array is ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("your array after sorting ");
		System.out.println(Arrays.toString(arr));
		int target = sc.nextInt();
		int result =serach(arr,target);
		if(result == -1){
			System.out.println(target+ " Element not found ");
		}
		else
		System.out.println(target+ " Element found at "+result+" index");
		
		


	}
}