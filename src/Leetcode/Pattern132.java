package Leetcode;

import java.util.Stack;

public class Pattern132 {

	static class pair {
		int min;
		int max;

		public pair(int min, int max) {
			this.min = min;
			this.max = max;
		}
	}

	public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(find132pattern(nums));
	}

	public static boolean find132pattern(int[] nums) {

		Stack<pair> s = new Stack<>();

		for (int i = 0; i < nums.length; i++) {
			if (s.isEmpty() || s.peek().min > nums[i]) {
				s.push(new pair(nums[i], nums[i]));
			} else if (s.peek().min < nums[i]) {
				pair last = s.pop();
				if (last.max > nums[i])
					return true;
				else {
					last.max = nums[i];

					while (!s.isEmpty() && s.peek().max <= nums[i])
						s.pop();

					if (!s.isEmpty() && s.peek().min < nums[i])
						return true;

					s.push(last);

				}
			}
		}

		return false;
	}
}
