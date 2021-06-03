package L41_BitManipulation;

public class DecimalToBinary {

	public static void main(String[] args) {

		int n = 57;
		int ans = 0;
		int mul = 1;

		while (n > 0) {

			int rem = n % 2;

			ans += rem * mul;

			mul = mul * 10;

			n = n / 2;

		}

		System.out.println(ans);
	}

}
