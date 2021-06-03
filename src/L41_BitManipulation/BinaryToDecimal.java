package L41_BitManipulation;

public class BinaryToDecimal {

	public static void main(String[] args) {
       
		int n = 100;
		int ans = 0;
		int mul = 1;
		
		while (n > 0) {

			int rem = n % 10;

			ans += rem * mul;

			mul = mul * 2;

			n = n / 10;

		}
       
		System.out.println(ans);

	}

}
