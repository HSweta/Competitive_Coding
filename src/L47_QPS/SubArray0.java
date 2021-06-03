package L47_QPS;

import java.util.HashSet;

public class SubArray0 {

	public static void main(String[] args) {

	}

	public static boolean subarray0sum(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		set.add(0); // if prefix sum at any point = 0 then

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (set.contains(sum))
				return true;

			set.add(sum);
		}

		return false;

	}
	
	

}
