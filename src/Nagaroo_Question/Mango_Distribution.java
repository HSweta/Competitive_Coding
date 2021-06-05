package Nagaroo_Question;

public class Mango_Distribution {

	public static void main(String[] args) {

		int m = 2, n = 2;

		System.out.println(Distribution(n, m));

	}

	public static int Binomial(int n, int m) {

		if (m > n - m) {
			m = n - m;
		}

		int res = 1;

		for (int i = 0; i < m; i++) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;

	}

	public static int Distribution(int n, int m) {

		int ways = Binomial(n + m - 1, n - 1);

		return ways;
	}
}
