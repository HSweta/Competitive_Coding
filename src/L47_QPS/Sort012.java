package L47_QPS;

public class Sort012 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 0, 2, 0, 1, 2, 2 };
		sort012(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void sort012(int[] arr) {

		int lo = 0;
		int mid = 0;
		int hi = arr.length - 1;

		while (mid <= hi) {

			if (arr[mid] == 0) {
				int temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;

			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
			}
		}

	}

}
