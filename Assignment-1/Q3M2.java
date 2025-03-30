/*Input: 

Output: -12-13-5-7-3-6 11 6 5

import java.util.*;
*/
import java.util.*;
class Q3M2{
	public static void rearrange(int arr[]){
	int resultarr[] = new int[arr.length];
		for(int i=0; i<arr.length-1;i++){
			
			if(arr[i]<0){
				resultarr[i]=arr[i];
			}
			else
				resultarr[i]=arr[i];
		}
		System.out.println(Arrays.toString(resultarr));
	}
	public static void main(String[] args){
		int arr[] = {-12, 11, -13, 5, 6, 7, 5, -3, -6}; 
		System.out.println("Arrays Before sorted");
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println("Arrays After sorted");
		//System.out.println(Arrays.toString(arr));
		rearrange(arr);
	}
}