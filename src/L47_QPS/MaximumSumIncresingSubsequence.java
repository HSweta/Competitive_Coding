package L47_QPS;

import java.util.Iterator;

public class MaximumSumIncresingSubsequence {

	public static void main(String[] args) {

		int[] arr = { 1, 101, 2, 3, 100, 4, 5 };

		int[] strg = new int[arr.length];

		for (int i = 0; i < strg.length; i++) {
			strg[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {

					int jContribution = strg[j] + arr[i];

					if (jContribution > strg[i])
						strg[i] = jContribution;

				}

			}

		}
        
		int max = Integer.MIN_VALUE;
		for (int val : strg) {
			max = Math.max(val, max);
		}
		
		System.out.println(max);

	}

}
