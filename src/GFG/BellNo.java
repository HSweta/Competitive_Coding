package GFG;

public class BellNo {

	public static void main(String[] args) {
		System.out.println(BNBU(5));
	}

	public static int BNBU(int n) {

		int[][] strg = new int[n + 1][n + 1];
		strg[0][0] = 1;

		for (int i = 1; i <strg.length; i++) {
			
			strg[i][0] = strg[i - 1][i-1];
			
			for (int j = 1; j <strg.length; j++) {
					strg[i][j] = strg[i][j - 1] + strg[i - 1][j - 1];
				}
			
		}

	return strg[n][0];

}

}
