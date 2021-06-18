package DP;

public class RodCutting {

	public static void main(String[] args) {
		int[] price = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
		System.out.println(RodCuttRec(price, price.length - 1));
		System.out.println(RodCutBU(price));

	}

	public static int RodCuttRec(int[] price, int n) {

		int left = 1;
		int right = n - 1;

		int max = price[n];
		
		while (left <= right) {

			int fp = RodCuttRec(price, left);
			int sp = RodCuttRec(price, right);

			int total = fp + sp;

			if (total > max)
				max = total;

			left++;
			right--;
		}

		return max;
	}

	public static int RodCuttTD(int[] price, int n, int[] strg) {

		if (strg[n] != 0) {
			return strg[n];
		}

		int left = 1;
		int right = n - 1;

		int max = price[n];

		while (left <= right) {

			int fp = RodCuttTD(price, left, strg);
			int sp = RodCuttTD(price, right, strg);

			int total = fp + sp;

			if (total > max)
				max = total;

			left++;
			right--;
		}

		strg[n] = max;

		return max;
	}

	public static int RodCutBU(int[] price) {

		int[] strg = new int[price.length];
		strg[0] = price[0];
		strg[1] = price[1];

		for (int n = 2; n <strg.length; n++) {
			int left = 1;
			int right = n-1;

			int max = price[n];

			while (left <= right) {

				int fp = strg[left];
				int sp = strg[right];

				int total = fp + sp;

				if (total > max)
					max = total;

				left++;
				right--;
			}

			strg[n] = max;

		}
		
		return strg[strg.length-1];
	}

}
