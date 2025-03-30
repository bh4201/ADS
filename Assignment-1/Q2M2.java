/*
*/import java.util.*;
class Q2M2{
	public static int serach(int arr[],int target){
		for(int i =0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}; 
		int target = sc.nextInt();
		int result =serach(arr,target);
		if(result == -1){
			System.out.println(target+ " Element not found ");
		}
		else
		System.out.println(target+ " Element found at "+result+" index");
		
		


	}
}