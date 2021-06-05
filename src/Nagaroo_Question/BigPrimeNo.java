package Nagaroo_Question;

public class BigPrimeNo {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5 ,7};

		System.out.println(nthUglyNumber(14, arr));

	}

	public static int nthUglyNumber(int n, int[] arr) {
		n = n - 1;
		int[] strg = new int[n + 1];
		strg[0] = 1;

		int[] candidates = new int[arr.length];

		for (int i = 1; i <= n; i++) {
			
			int minimum = Integer.MAX_VALUE;
			
			for (int j = 0; j < arr.length; j++) {

				minimum = Math.min(minimum, arr[j] * strg[candidates[j]]);
			}


			strg[i] = minimum;
			
			for (int j = 0; j < arr.length; j++) {
				if (minimum == arr[j] * strg[candidates[j]])
					candidates[j]++;
			}

		}

		for (int i = 0; i < strg.length; i++) {
			System.out.println(i + " -> " + strg[i]);
		}

		return strg[n];
	}

}
