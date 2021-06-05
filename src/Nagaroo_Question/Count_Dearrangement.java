package Nagaroo_Question;

public class Count_Dearrangement {

	public static void main(String[] args) {

		int n = 3;

//		System.out.println("-----Recursion------");
//		System.out.println(De_CountR(n));

		System.out.println(De_CountDPSE(n));

	}

	public static int De_CountR(int n) {

		if (n == 1)
			return 0;
		if (n == 2)
			return 1;

		return (n - 1) * (De_CountR(n - 1) + De_CountR(n - 2));
	}

	public static int De_CountDP(int n) {

		int[] strg = new int[n + 1];

		strg[1] = 0;
		strg[2] = 1;

		for (int i = 3; i <= n; i++) {
			strg[i] = (i - 1) * (strg[i - 1] + strg[i - 2]);

		}

		return strg[n];
	}

	public static int De_CountDPSE(int n) {

		int[] strg = new int[n + 1];

		int a = 0;
		int b = 1;
		for (int i = 3; i <= n; i++) {
			int cur = (i - 1) * (a + b);
			a = b;
			b = cur;

		}

		return b;
	}

}
