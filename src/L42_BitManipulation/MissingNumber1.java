package L42_BitManipulation;

public class MissingNumber1 {

	public static void main(String[] args) {

		int n = 7;
		int[] arr = { 4, 3, 2, 1, 7, 6 };

		int xor = 0;

		for (int val : arr) {
			xor ^= val;
		}

		for (int i = 1; i <= n; i++) {
            xor ^=i;
		}
		
		System.out.println(xor);

	}

}
