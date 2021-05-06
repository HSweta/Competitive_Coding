package L23_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_Sum {

	public static void main(String[] args) {

		int[] denom = {2,3,5};

		ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();

		// userRespect(denom, 6, 0, temp, list);
          CoinRespect(denom, 6, 0, temp, list);
		 System.out.println(list);

//		int[] denom = { 2, 5, 2, 1, 2 };
//		Arrays.sort(denom);
//		sum_Comb2(denom, 5, 0, temp, list);
//		System.out.println(list);

	}

	public static void userRespect(int[] denom, int amt, int vidx, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (amt == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (amt < 0)
			return;

		for (int i = vidx; i < denom.length; i++) {
			temp.add(denom[i]);
			userRespect(denom, amt - denom[i], i, temp, list);
			temp.remove(temp.size() - 1); // backtracking

		}
	}

	public static void CoinRespect(int[] denom, int amt, int vidx, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (amt == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (vidx == denom.length || amt < 0)
			return;

		temp.add(denom[vidx]);
		CoinRespect(denom, amt - denom[vidx], vidx, temp, list);
		temp.remove(temp.size() - 1); // backtracking
		CoinRespect(denom, amt, vidx + 1, temp, list);

	}

	public static void sum_Comb2(int[] denom, int amt, int vidx, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (amt == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (amt < 0)
			return;

		for (int i = vidx; i < denom.length; i++) {
			if (i > vidx && denom[i] == denom[i - 1])
				continue;
			temp.add(denom[i]);
			sum_Comb2(denom, amt - denom[i], i + 1, temp, list);
			temp.remove(temp.size() - 1); // backtracking

		}
	}

}
