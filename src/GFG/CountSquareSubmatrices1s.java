package GFG;

public class CountSquareSubmatrices1s {

	public static void main(String[] args) {
		int arr[][] = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };
		
		System.out.println(CountSubmatrix(arr));
	}

	public static int CountSubmatrix(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;

		int[][] dp = new int[m + 1][n + 1];
		int count = 0;
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (arr[i][j] == 1) {
					dp[i][j] = Math.min(dp[i + 1][j], Math.min(dp[i + 1][j + 1], dp[i][j + 1])) + 1;
					count += dp[i][j];
				}
			}
		}

		return count;

	}
}
