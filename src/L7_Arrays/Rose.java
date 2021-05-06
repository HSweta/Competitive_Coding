package L7_Arrays;

import java.util.Arrays;

public class Rose {
  
	public static void main(String[] args) {
		int arr[]= {10 ,2 ,6 ,8 ,4};
		Arrays.sort(arr);
		binary(arr,10 );
	}
	
	public static void binary(int[] arr,int item){
       
		int lo=0;
        int hi=arr.length-1;
        
         int[] sum=new int[2];
        while(lo<=hi){
            int i=0;
            int mid=(lo+hi)/2;

            if(item-arr[mid]>arr[mid]) {
            	item=item-arr[mid];
                sum[i]=arr[mid];
            	hi=mid-1;
            	i++;
            }
                
            else if(item-arr[mid]<=arr[mid]){
                  item=item-arr[mid];
                  sum[i]=arr[mid];
                  hi=mid-1;
                  i++;
            }  
            else if(item==0){
                System.out.println("Deepak should buy roses whose prices are" +sum[0]+ " and "+sum[1]+".");  
            }
              
        }
        

    }
}
