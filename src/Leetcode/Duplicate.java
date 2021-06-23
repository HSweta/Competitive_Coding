package Leetcode;

import java.util.HashMap;

public class Duplicate {
	public static void main(String[] args) {
	  int[] nums = {1,2,3,1};
	  int k = 3;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
  
          if(!map.containsKey(nums[i])){
        	 map.put(nums[i], i);
        	 //System.out.println(nums[i]);
          }else {
        		 if((i-map.get(nums[i]))<=k){
        			 System.out.println("t");
        		 }
        	 }
          }
      }
}

