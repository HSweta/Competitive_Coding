package GFG;

import java.util.Iterator;

public class GoldMine {

	public static void main(String[] args) {
		int arr[][]= { {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2} };
		
		System.out.println(GoldMineDP(arr));

	}

	public static int GoldMineDP(int[][] arr) {

		int[][] dp = new int[arr.length][arr[0].length];

		for (int col = arr[0].length - 1; col >= 0; col--) {
			for (int row = 0; row < arr.length; row++) {
				if (col == arr[0].length - 1) {
					dp[row][col] = arr[row][col];
				} else if (row == 0) {
					dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row + 1][col + 1]);
				} else if (row == arr.length - 1) {
					dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row - 1][col + 1]);
				} else {
					dp[row][col] = arr[row][col]
							+ Math.max(dp[row - 1][col + 1], Math.max(dp[row][col + 1], dp[row + 1][col + 1]));
				}
			}
		}

		int max = dp[0][0];
		for (int i = 1; i < dp.length; i++) {
			if (max < dp[i][0])
				max = dp[i][0];
		}
		
		return max;
	}

}
