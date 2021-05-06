package L23_Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequential_Digits {

	public static void main(String[] args) {
		sequentialDigits(1000, 13000);

	}

	public static List<Integer> sequentialDigits(int low, int high) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 9; i++)
			Sequential_Digits(i, low, high, list);

		Collections.sort(list);

		return list;
	}

	public static void Sequential_Digits(int curr, int low, int high, List<Integer> list) {

		if (curr > high)
			return;

		if (curr >= low && curr <= high) {
			list.add(curr);
		}

		int ld = curr % 10;

		if (ld != 9)
			Sequential_Digits(curr * 10 + (ld + 1), low, high, list);

	}

}
