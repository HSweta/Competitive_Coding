package L23_Leetcode;

import java.util.*;

public class _46_Permutation {

	public static void main(String[] args) {
       
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

			available[i] = false;
			temp.add(arr[i]);
			permutation(arr, available, temp, list);
			temp.remove(temp.size() - 1);
			available[i] = true;

		}

	}

}
