package L23_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetCase2UserRespect {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
		UserRespect(arr, 0, temp, list);
		System.out.println(list);

	}
	
	public static void UserRespect(int[] nums,int vidx,ArrayList<Integer> temp,List<List<Integer>> list){
	      
        list.add(new ArrayList<>(temp));
      
      
      for(int i=vidx;i<nums.length;i++){
          
          if(i>vidx && nums[i]==nums[i-1])
              continue;
          
           temp.add(nums[i]);
           UserRespect(nums,i+1,temp,list);
           temp.remove(temp.size()-1);
      
      }
      
  }

}
