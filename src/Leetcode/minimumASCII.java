package Leetcode;

public class minimumASCII {

	public static void main(String[] args) {
		String s1 = "leet";
		String s2 = "delete";

		System.out.println(helper(s1, s2));
		System.out.println(helperBU(s1, s2));
	}

	public static int helper(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			int sum = 0;

			for (int i = 0; i < s1.length(); i++)
				sum += s1.charAt(i);

			for (int i = 0; i < s2.length(); i++)
				sum += s2.charAt(i);

			return sum;
		}

		if (s1.charAt(0) == s2.charAt(0))
			return helper(s1.substring(1), s2.substring(1));
		else {

			int firstPart = helper(s1.substring(1), s2) + s1.charAt(0);
			int secondPart = helper(s1, s2.substring(1)) + s2.charAt(0);

			return Math.min(firstPart, secondPart);

		}

	}

	public static int helperBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {

				if (i == s1.length() || j == s2.length()) {

					int sum = 0;

					for (int k = i; k < s1.length(); k++)
						sum += s1.charAt(k);

					for (int k = j; k < s2.length(); k++)
						sum += s2.charAt(k);

					strg[i][j] = sum;

					continue;
				}

				if (s1.charAt(i) == s2.charAt(j)) {
					
					strg[i][j] = strg[i + 1][j + 1];
					
				} else {
					int fp = strg[i + 1][j] + s1.charAt(i);
					int sp = strg[i][j + 1] + s2.charAt(j);

					strg[i][j] = Math.min(fp, sp);

				}

			}
		}

		return strg[0][0];

	}

}
