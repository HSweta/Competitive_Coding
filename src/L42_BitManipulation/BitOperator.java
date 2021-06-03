package L42_BitManipulation;

public class BitOperator {

	public static void main(String[] args) {

		System.out.println(20 | 40);
		System.out.println(36 & 40);
		System.out.println(36 ^ 40);

		byte by = 77;
		by = (byte) (by << 1);
		// out of range of byte after left shift
		System.out.println(by);
		System.out.println("Triple Right Shift");
		
		byte by1 = -78;
		by1 = (byte) (by >>> 1);
		System.out.println(by1);
		
	}

}
