package L47_QPS;

public class CountWays {
	static int count = 0;

	public static void main(String[] args) {
		//Rec(4);
	    //System.out.println(count);
		
		System.out.println(CountWaysN(4));

	}

	public static int CountWaysN(int n) {

		int[] strg = new int[n + 1];
		strg[1] = 1;
		strg[0] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n - 1];
	}

	public static void Rec(int n) {

		if (n == 0) {
			count++;
			return;

		}

		if (n < 0)
			return;

		Rec(n - 1);
		Rec(n - 2);
	}

}
