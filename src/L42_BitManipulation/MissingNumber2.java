package L42_BitManipulation;

public class MissingNumber2 {

	public static void main(String[] args) {

		int n = 6;

		int xor = 0;

		int[] arr = { 1, 4, 3, 6 };

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

		System.out.println(n1 + " " + n2);

	}
}
