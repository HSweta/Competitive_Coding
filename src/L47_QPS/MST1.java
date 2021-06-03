package L47_QPS;

import java.util.Scanner;

public class MST1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		int[] arr = new int[tc];

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}

		int n = max;
		int[] strg = new int[n + 1];
		strg[1] = 0;

		for (int i = 2; i <= n; i++) {

			int ans = strg[i - 1];

			if (i % 2 == 0)
				ans = Math.min(ans, strg[i / 2]);

			if (i % 3 == 0)
				ans = Math.min(ans, strg[i / 2]);

			strg[i] = ans + 1;
		}

		for (int i = 0; i < tc; i++) {
			System.out.println("Case " + (i + 1) + ": " + strg[arr[i]]);

		}

	}

	public static int minStepsBU(int n) {

		int[] strg = new int[n + 1];
		strg[1] = 0;

		for (int i = 2; i <= n; i++) {

			int ans = strg[i - 1];

			if (i % 2 == 0)
				ans = Math.min(ans, strg[i / 2]);

			if (i % 3 == 0)
				ans = Math.min(ans, strg[i / 2]);

			strg[i] = ans + 1;
		}
		return strg[n];
	}

}
