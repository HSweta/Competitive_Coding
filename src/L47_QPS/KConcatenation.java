package L47_QPS;

public class KConcatenation {

	public static void main(String[] args) {

		int[] arr = {1,2};
		int k = 3;
		
		System.out.println(kConcatenationSum(arr, k));

	}

	public static int kConcatenationSum(int[] arr, int k) {
        int mod = 1000000007;
		long sum = 0;

		for (int i : arr) {
			sum += i;
		}

		if (k == 0)
			return kadane(arr);

		else if (sum < 0)
			return kadane2Repeat(arr);

		else {

			int res = (int)((kadane2Repeat(arr) + (k - 2) * sum) % mod);
			return res;
		}
	}

	public static int kadane2Repeat(int[] arr) {

		int[] na = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			na[i] = arr[i];
			na[arr.length + i] = arr[i];
		}

		return kadane(na);
	}

	public static int kadane(int[] arr) {
		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max)
				max = sum;

		}

		if (max < 0)
			max = 0;

		return max;

	}

}
