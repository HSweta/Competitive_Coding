package L47_QPS;

public class HammingDistance {

	public static void main(String[] args) {

		int x = 1;
		int y = 4;
		int count = 0;

		int xor = x ^ y;

		while (xor > 0) {

			if ((xor & 1) == 1)
				count++;

			xor >>= 1;

		}
		
		System.out.println(count);
	}
}
