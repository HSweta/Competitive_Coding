package GFG;

public class MaxSumPath {
	public static void main(String[] args) {

		int mat[][] = { { 10, 10, 2, 0, 20, 4 }, { 1, 0, 0, 30, 2, 5 }, { 0, 10, 4, 0, 2, 0 }, { 1, 0, 2, 20, 0, 4 } };

		System.out.println(MaxPath(mat));
	}

	public static int MaxPath(int[][] arr) {

		int res = -1;
		int n = arr.length;
		int m = arr[0].length;
		int[][] strg = new int[n][m];

		for (int i = 0; i < m; i++)
			strg[0][i] = arr[0][i];

		for (int i = 1; i < arr.length; i++) {
			res = -1;
			for (int j = 0; j < arr[0].length; j++) {
				if (j > 0 && j < arr[0].length - 1) {
					strg[i][j] = arr[i][j] + Math.max(strg[i - 1][j], Math.max(strg[i - 1][j + 1], strg[i - 1][j - 1]));
				} else if (j > 0) {
					strg[i][j] = arr[i][j] + Math.max(strg[i - 1][j], strg[i - 1][j - 1]);
				} else if (j < m - 1) {
					strg[i][j] = arr[i][j] + Math.max(strg[i - 1][j], strg[i - 1][j + 1]);
				}

				res = Math.max(res, strg[i][j]);
			}
		}

		return res;

	}
}
