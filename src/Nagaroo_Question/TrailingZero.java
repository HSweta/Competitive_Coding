package Nagaroo_Question;

public class TrailingZero {

	public static void main(String[] args) {

		int n = 100;
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5) {
			count += n / i; // 100/5 , 100/25
		}

		System.out.println(count);
	}

}
