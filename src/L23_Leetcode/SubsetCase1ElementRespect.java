package L23_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubsetCase1ElementRespect {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		//elementRespect(arr, 0, "");

        ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		
		elementRespect(arr, 0, temp, list);
		System.out.println(list);
		

	}
	
	public static void elementRespect(int[] arr,int vidx,String ans) {
		
		if(vidx==arr.length) {
			System.out.println(ans);
			return;
		}
		
		if(vidx>arr.length)
			return;
		
		elementRespect(arr, vidx+1, ans+arr[vidx]); // Yes
		elementRespect(arr, vidx+1, ans); // No
	}
	
public static void elementRespect(int[] arr,int vidx,List<Integer> temp,List<List<Integer>> list) {
		
		if(vidx==arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(vidx>arr.length)
			return;
		
		temp.add(arr[vidx]);
		elementRespect(arr, vidx+1, temp,list); // Yes
		temp.remove(temp.size()-1);
		
		elementRespect(arr, vidx+1, temp,list); // No
	}
  

}
