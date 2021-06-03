package L47_QPS;

import java.util.Arrays;

public class SumSubsequenceWidth {

	public static void main(String[] args) {
		

	}

	public static int sumSubseqWidths(int[] arr) {

		Arrays.sort(arr);
		int mod = 1000_000_007;

		// create an array which is storing power of 2
		long[] power = new long[arr.length];

		power[0] = 1;
		for (int i = 1; i < power.length; i++) {
			power[i] = (power[i - 1] * 2) % mod;
		}

		long max = 0;
		long min = 0;

		// go to every element and ask for its contribution in max and min
		for (int i = 0; i < arr.length; i++) {
			max = (min + arr[i] * power[i]) % mod;
			min = (min + arr[i] * power[arr.length - i - 1]) % mod;
		}

		return (int) (max - min);
	}

}
