package L47_QPS;

public class MissingPositiveNo {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 1 };

		System.out.println(firstMissingPostive(arr));

	}

	public static int firstMissingPostive(int[] arr) {

		int n = arr.length;

		// 1. ignore all -ve and > n
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0 || arr[i] > n)
				arr[i] = n + 1;

		}

		// 2. values which are present , -ve mark
		for (int i = 0; i < n; i++) {

			int val = Math.abs(arr[i]) - 1;

			if (val <= n && arr[val] > 0)
				arr[val] = -arr[val];

		}

		// 3. iterate over array to find out the index which is having +ve no

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				return i + 1;

		}

		return n + 1;

	}

}
