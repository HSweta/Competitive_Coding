package L23_Leetcode;

import java.util.Arrays;

public class CoinChangeCase3CoinRespect {

	public static void main(String[] args) {

		int[] denom = { 2, 2, 4 }; // array must be sorted
		Arrays.sort(denom);
		coinRespect(denom, 0, 6, "", true);

	}

	public static void coinRespect(int[] denom, int vidx, int amt, String ans, boolean flag) {

		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		if (vidx == denom.length || amt < 0)
			return;

		if (flag == false && denom[vidx] == denom[vidx - 1]) {
			coinRespect(denom, vidx + 1, amt, ans, false);
		} else {
			coinRespect(denom, vidx + 1, amt - denom[vidx], ans + denom[vidx], true);
			coinRespect(denom, vidx + 1, amt, ans, false);
		}
	}

}
