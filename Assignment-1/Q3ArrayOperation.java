import java.util.*;
class ArryOp
{
	static int serach(int arr[],int x){
		int target = x;
		int start=0;
		int end =arr.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]<target){
				 start=mid+1;
				
			}
			else{
				end = mid-1;
			}
		}
		return -1;
	}
	static void occurenceOfKey(int arr[],int x)
	{
		int y =x;
		int count=0;
		int b[] = new int[arr.length];
		b=arr;
		int first = -1;
		int last = -1;
		for(int i=0;i<arr.length;i++)
		{
         if (b[i] == y) 
		 {
            if(first == -1){
				first = i;
				count++;
			} 
				
			else
			{
				last = i;
				count++;
			}       
         }	
        }			
		
		System.out.println("First occurence at index: "+first);
		System.out.println("Last occurence at index: "+last);
		System.out.println("Total occurence at index: "+count);
	}


	public static void peak()
	{
		int arr[]={1, 2, 18, 4, 5, 0};
		int larger =-1;
		int index =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>larger)
			{
				larger = arr[i];
				index =i;
			}
			
		}
		if(larger > arr[index-1] && larger > arr[index+1])
		{
			System.out.println("Peak Element is : "+larger);
		} 
			
	}	
}


class Q3ArrayOperation{
	public static void main(String args[]){
		int arr[] = {1, 3, 3, 3, 5, 6, 8};
		int key = 3;
		int result = ArryOp.serach(arr,key);
		if(result == -1){
			System.out.println(key+" Element not found");
		}
		else{
			System.out.println(key+" Element  found at index " +result);
		}
		ArryOp.occurenceOfKey(arr,key);
		ArryOp.peak();
	}
}