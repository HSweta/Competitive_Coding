package DP;

public class LongestPalindromicSS {

	public static void main(String[] args) {
		String str = "abccgb";

		System.out.println(longestPalindromicSSRec(str, 0, str.length() - 1));
		System.out.println(longestPalindromicSSBU(str));

	}

	public static int longestPalindromicSSRec(String str, int si, int ei) {

		if (si > ei) {
			return 0;
		}

		if (si == ei) {
			return 1;
		}

		int ans = 0;

		if (str.charAt(si) == str.charAt(ei)) {
			ans = longestPalindromicSSRec(str, si + 1, ei - 1) + 2;
		} else {

			int o1 = longestPalindromicSSRec(str, si + 1, ei);
			int o2 = longestPalindromicSSRec(str, si, ei - 1);

			ans = Math.max(o1, o2);
		}

		return ans;
	}

	public static int longestPalindromicSSTD(String str, int si, int ei, int[][] strg) {

		if (si > ei) {
			return 0;
		}

		if (si == ei) {
			return 1;
		}

		if (strg[si][ei] != 0)
			return strg[si][ei];

		int ans = 0;

		if (str.charAt(si) == str.charAt(ei)) {
			ans = longestPalindromicSSTD(str, si + 1, ei - 1, strg) + 2;
		} else {

			int o1 = longestPalindromicSSTD(str, si + 1, ei, strg);
			int o2 = longestPalindromicSSTD(str, si, ei - 1, strg);

			ans = Math.max(o1, o2);
		}

		strg[si][ei] = ans;

		return ans;
	}

	public static int longestPalindromicSSBU(String str) {
		int n = str.length();
		int[][] strg = new int[n][n];

		for (int slide = 0; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				if (si == ei) {
					strg[si][ei] = 1;
				} else {

					int ans = 0;

					if (str.charAt(si) == str.charAt(ei)) {
						ans = strg[si + 1][ei - 1] + 2;
					} else {
						int o1 = strg[si + 1][ei];
						int o2 = strg[si][ei - 1];

						ans = Math.max(o1, o2);
					}

					strg[si][ei] = ans;
				}
			}
		}

		return strg[0][n - 1];
	}

}
