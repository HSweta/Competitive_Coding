package GFG;

public class FriendPair {

	public static void main(String[] args) {
		System.out.println(friendPairFib(4));

	}

	public static int friendPairRec(int n) {

		if (n <= 2)
			return n;

		int sp1 = friendPairRec(n - 1);
		int sp2 = (n - 1) * friendPairRec(n - 2);

		return sp1 + sp2;
	}

	public static int friendPairDP(int n) {

		int[] strg = new int[n + 1];
		strg[1] = 1;
		strg[2] = 2;
		for (int i = 3; i <= n; i++) {
			strg[i] = strg[i - 1] + (i - 1) * strg[i - 2];
		}

		return strg[n];
	}

	public static int friendPairFib(int n) {

		int a = 1;
		int b = 2;
		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = b + (i - 1) * a;
			a = b;
			b = c;
		}

		return c;
	}

}
