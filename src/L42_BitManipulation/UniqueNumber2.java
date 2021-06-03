package L42_BitManipulation;

public class UniqueNumber2 {

	public static void main(String[] args) {

		int[] arr = { 36, 50, 24, 56, 24, 42, 50 , 36 };

		int xor = 0;

		for (int i : arr) {
			xor ^= i;
		}

		int rbsbMask = xor & (-xor);

		int n1 = 0;
		int n2 = 0;

		for (int val : arr) {

			// unset
			if ((val & rbsbMask) == 0) {
				n1 ^= val;
			}
			// set
			else {
				n2 ^= val;

			}

		}
		
		System.out.println(n1+" "+n2);

	}

}
