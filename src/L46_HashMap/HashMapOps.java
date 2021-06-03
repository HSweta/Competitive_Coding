package L46_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapOps {

	public static void main(String[] args) {

		String str = "hirrrrrrree";
		// System.out.println(Freq(str));

		int[] a1 = { 10, 20, 50, 5, 60, 20, 50, 50, 3, 50, 10 };
		int[] a2 = { 2, 10, 70, 10, 20, 2, 80, 3, 1, 3 };

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

		// intersection(a1, a2);

		longestSequence(arr);

	}

	public static char Freq(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
//			if (map.containsKey(str.charAt(i)))
//				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//			else
//				map.put(str.charAt(i), 1);

			int nf = map.getOrDefault(str.charAt(i), 0) + 1;

			map.put(str.charAt(i), nf);

		}

		int max = 0;

		char ans = ' ';

		for (char key : map.keySet()) {

			int val = map.get(key);

			if (max < val) {
				max = val;
				ans = key;
			}

		}

		return ans;
	}

	public static void intersection(int[] a1, int[] a2) {

		HashMap<Integer, Integer> map = new HashMap<>();

		ArrayList<Integer> res = new ArrayList<>();

		int count = 0;
		for (int key : a1) {
			int nf = map.getOrDefault(key, 0) + 1;
			map.put(key, nf);

		}

		for (int val : a2) {
			if (map.containsKey(val) && map.get(val) > 0) {
				res.add(val);
				map.put(val, map.getOrDefault(val, 0) - 1);
				count++;
			}
		}

		System.out.println(res);
	}

	public static void longestSequence(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int key : arr) {

			if (map.containsKey(key - 1)) {
				map.put(key, false);

			} else {
				map.put(key, true);
			}

			if (map.containsKey(key + 1))
				map.put(key + 1, false);

		}
		int max = 0;
		int startingPoint = 0;

		// loop on all keys
		for (int key : map.keySet()) {
			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count))
					count++;

				// System.out.println(key+ " -> "+count);

				if (count > max) {
					max = count;
					startingPoint = key;
				}

			}
		}

		for (int i = 0; i < max; i++) {
			System.out.println(startingPoint + i);

		}
	}

}
