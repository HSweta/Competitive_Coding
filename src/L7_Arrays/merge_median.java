package L7_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class merge_median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums1 = {1,3}, nums2 = {2,4};
//		int[] nums1= {0,0,0,0};
//		ArrayList<ArrayList<Integer>> r=threeSum(nums1);
//		
//		for(int i=0;i<r.size();i++)
//			System.out.println(r.get(i));
//		
//		
		
		int[] nums= {1,1,1,0};
		
		System.out.println(threeSumClosest(nums, 100));
		

//    int[] merge=new int[nums1.length+nums2.length];
//        
//        for(int i=0;i<nums1.length;i++)
//            merge[i]=nums1[i];
//        
//        for(int j=0;j<nums2.length;j++)
//            merge[j+nums1.length]=nums2[j];
//        
//        Arrays.sort(merge);
//        
//        for(int val:merge)
//        	System.out.println(val);
//        double result=0;
//       
//        int n=merge.length;
//        if(n%2==1)
//          result=merge[n/2];
//        else
//            result=(double)((merge[n/2-1]+merge[n/2]))/2;
//        
//        System.out.println(result);
    }
	
	
public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        
        if(nums.length==0 || (nums.length==1 && nums[0]==0))
            return new ArrayList<>();
        
        int count=0;
        
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
              count++;
              continue;  
            }else{
             break;
            }
         
         }

        if(count==nums.length){
          ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
            
           for(int k=1;k<=count-2;k++){
           
              ArrayList<Integer> a2 = new ArrayList<Integer>(); 
                  a2.add(0);
                    a2.add(0);
                    a2.add(0);

             list1.add(a2);  
           }
            return list1;
            
        
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
         
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=0;i--){
           int l=0;
            int r=i-1;
            
            while(l<r){
             
                if(nums[i]+nums[l]+nums[r]==0){
                    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
                    a1.add(nums[l]);
                    a1.add(nums[r]);
                    a1.add(nums[i]);
                    list.add(a1);
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]>0)
                    r--;
                    
                else if(nums[i]+nums[l]+nums[r]<0)
                        l++;
            }
        
        }
    
    return list;
    }

public static int threeSumClosest(int[] nums, int target) {
    ArrayList<Integer> arr = new ArrayList<>();
    
    
    for(int i=nums.length-1;i>1;i--){
         int l=0;
        int r=i-1;
        
        while(l<r){
          arr.add(nums[l]+nums[r]+nums[i]);
          
            l++;
            r--;
        }
    }
  
   
   Collections.sort(arr);
    
    for(int i=0;i<arr.size();i++)
    	System.out.println(arr.get(i));
    int ans=arr.get(0);
    for(int i=1;i<arr.size();i++){
    	
    	  if(target<0) 
    		return ans;
    	  
    	else {
       if(arr.get(i)>=target && ans<arr.get(i) && ans>=target) {
    	        ans=arr.get(i);
           }
       }
    }
    
    return ans;
}
}


