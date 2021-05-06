package L23_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();

//		Comb_Coin(1, 4, 2, temp, list);
		
		UserRespect(1,9,3,temp, list);
		System.out.println(list);

	}

	public static void Comb(int start, int n, int k, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (k < 0)
			return;

		for (int i = start; i <= n; i++) {

			temp.add(i);
			Comb(i + 1, n, k - 1, temp, list);
			temp.remove(temp.size() - 1); // backtracking

		}
	}

	public static void Comb_Coin(int start, int n, int k, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (k < 0 || start > n)
			return;

		temp.add(start);
		Comb_Coin(start + 1, n, k - 1, temp, list);
		temp.remove(temp.size() - 1); // backtracking

		Comb_Coin(start + 1, n, k, temp, list);

	}
	
	public static void UserRespect(int start ,int n, int k, ArrayList<Integer> temp, List<List<Integer>> list) {

		if (k ==0 && n==0) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (n < 0 || start > 9)
			return;
		
        temp.add(start);
		UserRespect(start+1, n - start, k - 1, temp, list);
		temp.remove(temp.size() - 1); // backtracking
		
		UserRespect(start+1, n, k, temp, list);
		

	}
	}
	

