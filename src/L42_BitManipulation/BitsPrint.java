package L42_BitManipulation;

public class BitsPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// way 1
		int x = 25;
		while (x != 0) {

			int rem = x % 2;
			System.out.println(rem);

			x = x / 2;
		}
		
		System.out.println("-----------------");
		
		// way 2
		int y = 10;
		
		while(y!=0) {
			
			int rem = y & 1;
			
			y = y>>1;
		}
		
	}

}
