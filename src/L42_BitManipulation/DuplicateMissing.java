package L42_BitManipulation;

import java.util.Iterator;

public class DuplicateMissing {

	public static void main(String[] args) {

		int n = 7;

		int xor = 0;

		int[] arr = { 1, 2, 3, 5, 5, 6 ,4};

		for (int v : arr) {
			xor ^= v;
		}

		for (int i = 1; i <= n; i++) {
			xor ^= i;
		}

		int mask = xor & (-xor);

		int n1 = 0;
		int n2 = 0;

		for (int val : arr) {

			if ((mask & val) == 0) {
				n1 ^= val;
			} else {
				n2 ^= val;
			}
		}

		for (int i = 1; i <= n; i++) {

			if ((mask & i) == 0) {
				n1 ^= i;
			} else {
				n2 ^= i;
			}

		}
          
		for (int val : arr) {
           System.out.println("----");
			if (val == n1) {

				System.out.println("Duplicate No : " + n1);
				System.out.println("Missing No : " + n2);
				break ;

			} else if (val == n2) {

				System.out.println("Duplicate No : " + n2);
				System.out.println("Missing No : " + n1);
				break ;

			}

		}
			
		}

	

}
