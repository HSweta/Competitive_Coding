package Leetcode;

import java.util.HashMap;

public class Duplicate2 {
	public static void main(String[] args) {
		int[] nums = { 1,5,9,1,5,9};
		System.out.println(containsNearbyAlmostDuplicate(nums, 2, 3));

	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			} else if (map.containsKey(nums[i]) && t == 0) {
				if (i - map.get(nums[i]) <= k)
					return true;
				else
					map.put(nums[i], i);
			}
			if (map.containsKey(Math.abs(nums[i] + k))) {
				if ((i - map.get(Math.abs(nums[i] + k))) <= t)
					return true;

			}

		}
		return false;

	}
}
