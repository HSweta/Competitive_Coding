package DP;

import java.util.Arrays;

public class LCS3Strings {

	public static void main(String[] args) {
		String s1 = "abcgd";
		String s2 = "bcgad";
		String s3 = "ad";

		System.out.println(LCS3StringsRec(s1, s2, s3, 0, 0, 0));

		int[][][] strg = new int[s1.length()][s2.length()][s3.length()];

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				Arrays.fill(strg[i][j], -1);
			}
		}

		System.out.println(LCS3StringsTD(s1, s2, s3, 0, 0, 0, strg));
        System.out.println(LCS3StringBU(s1, s2, s3));
	}

	public static int LCS3StringsRec(String s1, String s2, String s3, int vidx1, int vidx2, int vidx3) {

		if (s1.length() == vidx1 || s2.length() == vidx2 || s3.length() == vidx3)
			return 0;

		int ans = 0;

		if (s1.charAt(vidx1) == s2.charAt(vidx2) && s1.charAt(vidx1) == s3.charAt(vidx3))
			ans = LCS3StringsRec(s1, s2, s3, vidx1 + 1, vidx2 + 1, vidx3 + 1) + 1;
		else {
			int o1 = LCS3StringsRec(s1, s2, s3, vidx1 + 1, vidx2, vidx3);
			int o2 = LCS3StringsRec(s1, s2, s3, vidx1, vidx2 + 1, vidx3);
			int o3 = LCS3StringsRec(s1, s2, s3, vidx1, vidx2, vidx3 + 1);

			ans = Math.max(o1, Math.max(o2, o3));
		}

		return ans;
	}

	public static int LCS3StringsTD(String s1, String s2, String s3, int vidx1, int vidx2, int vidx3, int[][][] strg) {

		if (s1.length() == vidx1 || s2.length() == vidx2 || s3.length() == vidx3)
			return 0;

		if (strg[vidx1][vidx2][vidx3] != -1)
			return strg[vidx1][vidx2][vidx3];
		int ans = 0;

		if (s1.charAt(vidx1) == s2.charAt(vidx2) && s1.charAt(vidx1) == s3.charAt(vidx3))
			ans = LCS3StringsTD(s1, s2, s3, vidx1 + 1, vidx2 + 1, vidx3 + 1, strg) + 1;
		else {
			int o1 = LCS3StringsTD(s1, s2, s3, vidx1 + 1, vidx2, vidx3, strg);
			int o2 = LCS3StringsTD(s1, s2, s3, vidx1, vidx2 + 1, vidx3, strg);
			int o3 = LCS3StringsTD(s1, s2, s3, vidx1, vidx2, vidx3 + 1, strg);

			ans = Math.max(o1, Math.max(o2, o3));
		}

		strg[vidx1][vidx2][vidx3] = ans;

		return ans;
	}

	public static int LCS3StringBU(String s1, String s2, String s3) {

		int[][][] strg = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];

		for (int vidx1 = s1.length() - 1; vidx1 >= 0; vidx1--) {

			for (int vidx2 = s2.length() - 1; vidx2 >= 0; vidx2--) {

				for (int vidx3 = s3.length() - 1; vidx3 >= 0; vidx3--) {

					if (s1.charAt(vidx1) == s2.charAt(vidx2) && s1.charAt(vidx1) == s3.charAt(vidx3))
						strg[vidx1][vidx2][vidx3] = strg[vidx1 + 1][vidx2 + 1][vidx3 + 1] + 1;
					else {
						int o1 = strg[vidx1+1][vidx2][vidx3];
						int o2 = strg[vidx1][vidx2+1][vidx3];
						int o3 = strg[vidx1][vidx2][vidx3+1];
						
						int ans = Math.max(o1, Math.max(o2, o3));
						
						strg[vidx1][vidx2][vidx3] = ans;
					} 

				}

			}
			

		}
		
		return strg[0][0][0];
	}

}
