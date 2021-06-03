package DP;

public class NoOfBST {

	public static void main(String[] args) {
		System.out.println(NoOfBSTRecursion(5));
		System.out.println(NoOfBSTBU(5));
	}

	public static int NoOfBSTRecursion(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		int total = 0;

		for (int i = 1; i <= n; i++) {
			int l = NoOfBSTRecursion(i - 1);
			int r = NoOfBSTRecursion(n - i);

			int ans = l * r;

			total += ans;
		}

		return total;

	}

	public static int NoOfBSTTD(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return 1;
		}

		if (strg[n] != 0)
			return strg[n];

		int total = 0;

		for (int i = 1; i <= n; i++) {

			int l = NoOfBSTTD(i - 1, strg);
			int r = NoOfBSTTD(n - i, strg);

			int ans = l * r;
			total += ans;
		}

		strg[n] = total;

		return total;

	}

	public static int NoOfBSTBU(int tn) {

		int[] strg = new int[tn + 1];

		strg[0] = 1;
		strg[1] = 1;

		for (int n = 2; n <= tn; n++) {
			
			int total = 0;

			for (int i = 1; i <= n; i++) {

				int l = strg[i - 1];
				int r = strg[n - i];

				int ans = l * r;
				total += ans;
			}

			strg[n] = total;

		}

		return strg[tn];

	}

}
