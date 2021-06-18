package DP;

public class Mixtures {

	public static void main(String[] args) {
		int[] arr = { 40, 60, 20, 50 };
		System.out.println(MixtureBU(arr));
		System.out.println(MixtureRec(arr, 0, arr.length - 1));

	}

	public static int MixtureRec(int[] arr, int si, int ei) {

		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int k = si; k <= ei - 1; k++) {

			int fp = MixtureRec(arr, si, k);
			int sp = MixtureRec(arr, k + 1, ei);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = fp + sp + sw;

			if (total < min)
				min = total;
		}

		return min;

	}

	public static int MixtureTD(int[] arr, int si, int ei, int[][] strg) {

		if (si == ei) {
			return 0;
		}

		if (strg[si][ei] != -1)
			return strg[si][ei];

		int min = Integer.MAX_VALUE;

		for (int k = si; k <= ei - 1; k++) {

			int fp = MixtureTD(arr, si, k, strg);
			int sp = MixtureTD(arr, k + 1, ei, strg);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = fp + sp + sw;

			if (total < min)
				min = total;
		}

		strg[si][ei] = min;

		return min;

	}

	public static int MixtureBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[n][n];

		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				if (si == ei) {
					strg[si][ei] = 0;
				} else {

					int min = Integer.MAX_VALUE;

					for (int k = si; k <= ei - 1; k++) {

						int fp = strg[si][k];
						int sp = strg[k + 1][ei];

						int sw = color(arr, si, k) * color(arr, k + 1, ei);

						int total = fp + sp + sw;

						if (total < min)
							min = total;

					}

					strg[si][ei] = min;

				}

			}

		}

		return strg[0][n - 1];
	}

	public static int color(int[] arr, int i, int j) {

		int sum = 0;

		for (int k = i; k <= j; k++) {
			sum += arr[k];
		}

		return sum % 100;
	}

}
