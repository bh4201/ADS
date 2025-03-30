import java.util.*;
class Q1{
	/*public static void duplicate(int arr[],int n){
		Set<Integer> st = new TreeSet<>();
		if(n==0){
			st.add(arr[n]);
			return ;
		}
		else{
			ist.add(arr[n]);
			duplicate(arr,n-1);
		}
		
	}*/
	public static void main(String[] args){

	
		int a[] = {0,3,1,2,2};
		
	
		Set<Integer> s1 = new HashSet<>();
		for(int x : a){
			if(!s1.add(x)){
				System.out.println(x);
			}
		}
		
		
		
		
	}
}