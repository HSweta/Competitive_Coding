package L7_Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        
       
		int q1 = sc.nextInt();
        int sum=0;
        
        for(int j=0;j<q1;j++){
        	
            int k=sc.nextInt();
            for(int i=n-1;i>=0;i--){
            	
   
                   if(i-k<0) {
                  
                   arr[i]=arr[i]+arr[n+(i-k)];
                   }
                 else{
                    
                     arr[i]=arr[i]+arr[i-k];
                 } 
           
            }
        
        }
        for(int h=0;h<n;h++) {
        	sum+=arr[h];
        }
        System.out.println(sum%(10^9+7) );
    }

	}


