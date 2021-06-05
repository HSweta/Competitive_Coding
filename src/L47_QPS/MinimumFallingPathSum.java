package L47_QPS;

import java.util.Arrays;

public class MinimumFallingPathSum {

	public static void main(String[] args) {
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

		System.out.println(minFallingPrint(arr));
		System.out.println(minFallingPathSumBU(arr));
	}

	public static int minFallingPrint(int[][] arr) {

		int min = Integer.MAX_VALUE;
		int[][] strg = new int[arr.length][arr[0].length];

		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg, Integer.MAX_VALUE);
		}
		for (int i = 0; i < arr[0].length; i++) {

			min = Math.min(min, minFallingPathSumTD(arr, 0, i, new int[arr.length][arr[0].length]));

		}

		return min;
	}

	public static int minFallingPathSum(int[][] arr, int row, int col) {

		if (col < 0 || col >= arr[0].length)
			return Integer.MAX_VALUE;

		if (row == arr.length)
			return 0;
//
////		if(row == arr.length)
//			return arr[row][col];

		int dleft = minFallingPathSum(arr, row + 1, col - 1);
		int below = minFallingPathSum(arr, row + 1, col);
		int dright = minFallingPathSum(arr, row + 1, col + 1);

		int ans = Math.min(dleft, Math.min(below, dright)) + arr[row][col];

		return ans;
	}

	public static int minFallingPathSumTD(int[][] arr, int row, int col, int[][] strg) {

		if (col < 0 || col >= arr.length)
			return Integer.MAX_VALUE;

		if (row == arr.length)
			return 0;

		if (strg[row][col] != 0)
			return strg[row][col];
//
////		if(row == arr.length)
//			return arr[row][col];

		int dleft = minFallingPathSumTD(arr, row + 1, col - 1, strg);
		int below = minFallingPathSumTD(arr, row + 1, col, strg);
		int dright = minFallingPathSumTD(arr, row + 1, col + 1, strg);

		int ans = Math.min(dleft, Math.min(below, dright)) + arr[row][col];

		strg[row][col] = ans;

		return ans;
	}

	public static int minFallingPathSumBU(int[][] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int row = n - 1; row >= 0; row--) {

			for (int col = 0; col < n; col++) {

				if (row == arr.length - 1)
					strg[row][col] = arr[row][col];
				else {
					int dleft = Integer.MAX_VALUE;
					int dright = Integer.MAX_VALUE;

					if (col - 1 >= 0)
						dleft = strg[row + 1][col - 1];

					int below = strg[row + 1][col];

					if (col + 1 < n)
						dright = strg[row + 1][col + 1];

					int ans = Math.min(dleft, Math.min(below, dright)) + arr[row][col];

					strg[row][col] = ans;

				}

			}
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < strg[0].length; i++) {
			min = Math.min(min, strg[0][i]);
		}

		return min;

	}

}
