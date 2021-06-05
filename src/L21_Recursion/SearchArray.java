package L21_Recursion;

import java.util.HashMap;
import java.util.Stack;

public class SearchArray extends Recursion3 {

	public static void main(String[] args) {
		int[][] arr = { { 3, 5, 3, 9, 5 }, { 4, 3, 2, 1, 9 }, { 9, 4, 7, 6, 4 }, { 6, 4, 7, 6, 4 }, { 1, 2, 5, 9, 1 } };
		System.out.println(Search(arr, 3));

	}

	public static int Search(int[][] arr, int k) {

		int ans = -1;

		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int count = 0;
				if (i == 0) {
					if (j == 0) {
						if (arr[i + 1][j + 1] == arr[i][j])
							count++;
						if (arr[i][j + 1] == arr[i][j])
							count++;
						if (arr[i + 1][j] == arr[i][j])
							count++;
					}

					else if (j == arr[0].length - 1) {
						if (arr[i + 1][j - 1] == arr[i][j])
							count++;
						if (arr[i][j - 1] == arr[i][j])
							count++;
						if (arr[i][j] == arr[i + 1][j])
							count++;
					}

					else if (j < arr.length - 1 && j > 0) {

						if (arr[i + 1][j + 1] == arr[i][j])
							count++;
						if (arr[i + 1][j - 1] == arr[i][j])
							count++;
						if (arr[i][j + 1] == arr[i][j])
							count++;
						if (arr[i + 1][j] == arr[i][j])
							count++;
						if (arr[i][j - 1] == arr[i][j])
							count++;

					}

				}

				else if (i == arr.length - 1) {
					if (j == arr.length - 1) {
						if (arr[i - 1][j - 1] == arr[i][j])
							count++;
						if (arr[i][j - 1] == arr[i][j])
							count++;
						if (arr[i - 1][j] == arr[i][j])
							count++;

					}

					else if (j == 0) {
						if (arr[i][j + 1] == arr[i][j])
							count++;
						if (arr[i][j] == arr[i - 1][j])
							count++;
					}

					else if (j < arr.length - 1 && j > 0) {
						if (arr[i][j + 1] == arr[i][j])
							count++;
						if (arr[i][j] == arr[i - 1][j])
							count++;
						if (arr[i][j - 1] == arr[i][j])
							count++;
					}
				}

				else {
					if (j > 0) {
						if (arr[i][j - 1] == arr[i][j])
							count++;
						if (arr[i + 1][j - 1] == arr[i][j])
							count++;
						if (arr[i - 1][j - 1] == arr[i][j])
							count++;
					} else if (j < arr[0].length - 1) {

						if (arr[i + 1][j + 1] == arr[i][j])
							count++;

						if (arr[i - 1][j + 1] == arr[i][j])
							count++;

						if (arr[i][j + 1] == arr[i][j])
							count++;
					}

					if (arr[i][j] == arr[i - 1][j])
						count++;
					if (arr[i][j] == arr[i + 1][j])
						count++;

				}

				if (count == k) {
				
					ans = arr[i][j];
					break;
				}
			}
		}

		return ans;
	}

}
