package DP;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		int[] strg = new int[n + 1];

		System.out.println(fibTD(n, strg));
		System.out.println(fibBU(n));
		System.out.println(fibBUSE(n));
	}

	// TC : 2^n SC : n + Rec Extra Space
	public static int fibRecursion(int n) {

		if (n == 0 || n == 1)
			return n;

		int fnm1 = fibRecursion(n - 1);
		int fnm2 = fibRecursion(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	// TC : n SC : n + Rec Extra Space
	public static int fibTD(int n, int[] strg) {

		if (n == 0 || n == 1)
			return n;

		if (strg[n] != 0) // re-use
			return strg[n];

		int fnm1 = fibTD(n - 1, strg);
		int fnm2 = fibTD(n - 2, strg);

		int fn = fnm1 + fnm2;

		strg[n] = fn; // store

		return fn;
	}

	// TC : n SC : n
	public static int fibBU(int n) {

		// array of size n+1
		int[] strg = new int[n + 1];

		// base case values fill
		strg[0] = 0;
		strg[1] = 1;

		// filling direction
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int fibBUSE(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;

		for (int slide = 1; slide <= n - 1; slide++) {

			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];
	}

}
