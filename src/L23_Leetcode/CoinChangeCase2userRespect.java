package L23_Leetcode;

public class CoinChangeCase2userRespect {

	public static void main(String[] args) {
		
		int[] denom = {1,2,3};
		coinRespect(denom, 0, 3, "");

	}

	public static void coinRespect(int[] denom, int vidx, int amt, String ans) {

		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		if (amt < 0) {
			return;
		}

		for (int i = vidx; i < denom.length; i++) {
			coinRespect(denom, i + 1, amt - denom[i], ans + denom[i]);
		}
	}

}
