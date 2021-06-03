package L47_QPS;

import java.util.Arrays;
import java.util.Scanner;

public class Aggrcow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nos = sc.nextInt();
		int noc = sc.nextInt();

		int[] stall = new int[nos];

		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}

		Arrays.sort(stall);

		// logic binary search

		int lo = 0;
		int hi = stall[stall.length - 1] - stall[0];

		int finalAns = 0;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (isItPossible(stall, noc, mid)) {
				finalAns = mid;
				;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] stall, int noc, int mid) {

		int cowPlaced = 1;
		int pos = stall[0];

		for (int i = 1; i < stall.length; i++) {

			if (stall[i] - pos >= mid) {
				cowPlaced++;
				pos = stall[i];
			}

			if (cowPlaced == noc)
				return true;

		}

		return false;

	}

}
