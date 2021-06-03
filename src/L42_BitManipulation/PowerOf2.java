package L42_BitManipulation;

public class PowerOf2 {

	public static void main(String[] args) {

		int n = 8;

		if (n != 0 && (n & (n - 1)) == 0) {
			
			System.out.println("Power of 2");
		} else {
			System.out.println("Not Power of 2");
		}

	}

}
