package GFG;

public class UniquePath {
	public static void main(String[] args) {
		int[][] A = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
	    System.out.println(UPDP(A));
	
	}

	public static int UPDP(int[][] arr) {

		int[][] strg = new int[arr.length][arr[0].length];

		boolean flag = false;

		for (int i = 0; i < strg.length; i++) {
			if (flag || arr[i][0] == 1) {
				strg[i][0] = 0;
				flag = true;
			} else {
				strg[i][0] = 1;
			}
		}

		flag = false;

		for (int j = 1; j < strg[0].length; j++) {
			if (flag || arr[0][j] == 1) {
				strg[0][j] = 0;
				flag = true;
			} else {
				strg[0][j] = 1;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					strg[i][j] = strg[i][j - 1] + strg[i - 1][j];
				} else {
					strg[i][j] = 0;
				}
			}
		}

		return strg[arr.length - 1][arr[0].length - 1];

	}
}
