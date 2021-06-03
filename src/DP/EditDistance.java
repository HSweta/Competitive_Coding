package DP;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "agcfd";

		System.out.println(EDRecursion(s1, s2));
		System.out.println(EDRecursionVidx(s1, s2, 0, 0));

		int[][] strg = new int[s1.length()][s2.length()];

		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}

		System.out.println(EDTD(s1, s2, 0, 0, strg));
		System.out.println(EDBU(s1, s2));
	}

	public static int EDRecursion(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0)
			return Math.max(s1.length(), s2.length());

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EDRecursion(ros1, ros2);
		} else {

			int o1 = EDRecursion(ros1, s2); // include
			int o2 = EDRecursion(s1, ros2);// delete;
			int o3 = EDRecursion(ros1, ros2); // replace

			ans = Math.min(o1, Math.min(o2, o3)) + 1;

		}

		return ans;

	}

	public static int EDRecursionVidx(String s1, String s2, int vidx1, int vidx2) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return Math.max(s1.length() - vidx1, s2.length() - vidx2);

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2 + 1);
		} else {

			int o1 = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2); // include
			int o2 = EDRecursionVidx(s1, s2, vidx1, vidx2 + 1);// delete;
			int o3 = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2 + 1); // replace

			ans = Math.min(o1, Math.min(o2, o3)) + 1;

		}

		return ans;

	}

	public static int EDTD(String s1, String s2, int vidx1, int vidx2, int[][] strg) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return Math.max(s1.length() - vidx1, s2.length() - vidx2);

		if (strg[vidx1][vidx2] != -1)
			return strg[vidx1][vidx2];

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EDTD(s1, s2, vidx1 + 1, vidx2 + 1, strg);
		} else {

			int o1 = EDTD(s1, s2, vidx1 + 1, vidx2, strg); // include
			int o2 = EDTD(s1, s2, vidx1, vidx2 + 1, strg);// delete;
			int o3 = EDTD(s1, s2, vidx1 + 1, vidx2 + 1, strg); // replace

			ans = Math.min(o1, Math.min(o2, o3)) + 1;

		}

		strg[vidx1][vidx2] = ans;

		return ans;

	}

	public static int EDBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < strg.length; i++) {
			strg[i][s2.length()] = s1.length() - i;
		}

		for (int i = 0; i < strg.length; i++) {
			strg[s1.length()][i] = s2.length() - i;
		}

		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1];
				}

				else {
					int i = strg[row + 1][col];
					int d = strg[row][col + 1];
					int r = strg[row + 1][col + 1];

					strg[row][col] = Math.min(i, Math.min(d, r)) + 1;

				}
			}

		}

		return strg[0][0];
	}

}
