package L6_Func_Arrays;

import java.util.Arrays;

public class Target_Sum_Triplets {

	public static void main(String[] args) {
		int[] arr= {5,7,9,1,2,4 ,6, 8, 3};
		Arrays.sort(arr);
		int n=9;
		int t=10;
		triplets(arr,n,t);
	}
    
	public static void triplets(int[] arr,int n,int t){
	     
		 for(int i=0;i<n;i++){
			 int l=i+1;
			 int r = n-1;
	         int sum=arr[i];
			 while(l<r){
	           if(sum+arr[l]+arr[r]==t) {
			       System.out.println(sum +" , " +arr[l]+ " and " +arr[r]);
				   l++;
				   r--;
	           }
			 else if(sum+arr[l]+arr[r]>t)
			   r--;
		 else
			 l++;
		 }
		}
	}
}
