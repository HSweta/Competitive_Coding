package L47_QPS;

public class Dearrangements {

	public static void main(String[] args) {

		System.out.println(dearrangementsRec(4));
		System.out.println(dearrangementBU(4));

	}

	public static int dearrangementsRec(int n) {

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		int deal = dearrangementsRec(n - 2);
		int nodeal = dearrangementsRec(n - 1);

		int total = deal + nodeal;

		int ans = (n - 1) * total;

		return ans;

	}

	public static int dearrangementsTD(int n, int[] strg) {

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		if (strg[n] != 0)
			return strg[n];

		int deal = dearrangementsTD(n - 2, strg);
		int nodeal = dearrangementsTD(n - 1, strg);

		int total = deal + nodeal;

		int ans = (n - 1) * total;

		strg[n] = ans;

		return ans;

	}

	public static int dearrangementBU(int n) {

		int[] strg = new int[n + 1];
		strg[1] = 0;
		strg[2] = 1;

		for (int i = 3; i <= n; i++) {

			int deal = strg[n - 2];
			int nodeal = strg[n - 1];

			int total = deal + nodeal;

			int ans = (i - 1) * total;

			strg[i] = ans;
		}

		return strg[n];
	}

}
