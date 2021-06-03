package L47_QPS;

public class Partitioning3Way {

	public static void main(String[] args) {

	}

	public static void sort012(int[] arr, int ll, int hl) {

		int lo = 0;
		int mid = 0;
		int hi = arr.length - 1;

		while (mid <= hi) {
			if (arr[mid] < ll) {
				int temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;

			} else if (arr[mid] >= ll && arr[mid] <= hl) {
				mid++;
			} else if (arr[mid] > hl) {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
			}
		}

	}

}
