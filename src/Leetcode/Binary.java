package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Binary {
	public static void main(String[] args) {
		List<Boolean> ans = new ArrayList<>();
		int[] nums = {1,1,0,0,0,1,0,0,1};
		int mult = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = (sum * 2 + nums[i]) % 5;
			System.out.println(sum);
			if (sum == 0)
				ans.add(true);
			else
				ans.add(false);

		}

		System.out.println(ans);
	}
}
