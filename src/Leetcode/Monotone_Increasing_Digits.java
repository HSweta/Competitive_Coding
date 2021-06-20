package Leetcode;

import java.util.ArrayList;

public class Monotone_Increasing_Digits {

	public static void main(String[] args) {

	}

	public static int monotoneIncreasingDigits(int n) {

		ArrayList<Integer> a = new ArrayList<>();

		int temp = n;

		while (n > 0) {
			a.add(0, n % 10);
			n = n / 10;
		}

		for (int i = 0; i < a.size() - 1; i++) {

			if (a.get(i) > a.get(i + 1)) {

				for (int j = i; j >= 0; j--) {

					if (j == 0 || a.get(j) > a.get(j - 1)) {
						a.set(j, a.get(j) - 1);

						for (int k = j + 1; k < a.size(); k++)
							a.set(k, 9);

						break;
					}
				}

				break;
			}

		}

		int result = 0;
		for (int i = 0; i < a.size(); i++) {
			result = result * 10 + a.get(i);
		}
		
		return result;
	}
}