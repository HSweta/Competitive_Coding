package L23_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
        System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		
		boolean[] available = new boolean[nums.length];
		
		Arrays.fill(available, true);
		
		permutation(nums, available, temp, list);
		return list;
	}

	public static void permutation(int[] arr, boolean[] available, List<Integer> temp, List<List<Integer>> list) {

		if (temp.size() == available.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < available.length; i++) {
            
			
			if (available[i] == false)
				continue;
			
			if(i > 0  && arr[i]==arr[i-1] && available[i-1])
				continue;

			available[i] = false;
			temp.add(arr[i]);
			permutation(arr, available, temp, list);
			temp.remove(temp.size() - 1);
			available[i] = true;

		}

	}

}
