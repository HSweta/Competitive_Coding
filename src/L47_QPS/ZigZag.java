package L47_QPS;

public class ZigZag {

	public static void main(String[] args) {

		int[] arr = {};

		boolean flag = true;

		for (int i = 0; i <= arr.length - 2; i++) {

			//      a < b
			// arr[i] < arr[i+1]
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

			//       b>c
			// arr[i] > arr[i+1]
			else {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			flag = !flag;

		}

	}

}
