package L47_QPS;

import java.util.Iterator;
import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nob = sc.nextInt();
		int nos = sc.nextInt();

		int[] pages = new int[nob];

		for (int i = 0; i < pages.length; i++) {
			pages[i] = sc.nextInt();
		}

		// bs logic ....
		int lo = 0;
		int hi = 0;

		for (int val : pages) {
			hi += val;
		}

		int finalAns = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(pages, mid, nos)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		System.out.println(finalAns);

	}

	private static boolean isItPossible(int[] pages, int mid, int nos) {

		int students = 1;
		int pagesRead = 0;

		int bn = 0;

		while (bn < pages.length) {

			if (pagesRead + pages[bn] <= mid) {
				pagesRead += pages[bn];
				bn++;
			} else {
				students++;
				pagesRead = 0;
			}
			if (students > nos)
				return false;

		}

		return true;
	}

}
