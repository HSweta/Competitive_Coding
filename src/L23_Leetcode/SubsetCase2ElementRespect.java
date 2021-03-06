package L23_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetCase2ElementRespect {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		Arrays.sort(arr);
		elementRespect(arr, 0, "", true);

		ArrayList<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();

		elementRespect(arr, 0, temp, list, true);
		System.out.println(list);

	}

	public static void elementRespect(int[] arr, int vidx, String ans, boolean flag) {

		if (vidx == arr.length) {
			System.out.println(ans);
			return;
		}

		if (vidx > arr.length)
			return;

		if (flag == false && arr[vidx] == arr[vidx - 1]) {
			elementRespect(arr, vidx + 1, ans, false);
		} else {
			elementRespect(arr, vidx + 1, ans + arr[vidx], true); // Yes
			elementRespect(arr, vidx + 1, ans, false); // No
		}
	}

	public static void elementRespect(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> list, boolean flag) {

		if (vidx == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (vidx > arr.length)
			return;

		if (flag == false && arr[vidx] == arr[vidx - 1]) {
			elementRespect(arr, vidx + 1, temp, list, false);
		} else {
			temp.add(arr[vidx]);
			elementRespect(arr, vidx + 1, temp, list,true); // Yes
			temp.remove(temp.size() - 1);

			elementRespect(arr, vidx + 1, temp, list,false); // No
		}
	}
}
