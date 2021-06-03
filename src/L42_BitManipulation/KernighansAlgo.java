package L42_BitManipulation;

public class KernighansAlgo {

	public static void main(String[] args) {

		int x = 120;
		int count = 0;
		while (x != 0) {

			int rmstMark = (x & (-x));
			x = x - rmstMark;
			count++;

		}
       
		System.out.println(count);
	}

}
