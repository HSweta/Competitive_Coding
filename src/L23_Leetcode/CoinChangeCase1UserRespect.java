package L23_Leetcode;

public class CoinChangeCase1UserRespect {

	public static void main(String[] args) {
		
		int[] denom = {1,2,3};
		userRespect(denom, 0, 5, "");

	}

	public static void userRespect(int[] denom, int vidx, int amt, String ans) {

		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		
		if (amt < 0) {
			return;
		}
		
		for (int i = vidx; i < denom.length; i++) {
			userRespect(denom, i, amt - denom[i], ans + denom[i]);

		}
	}

}
