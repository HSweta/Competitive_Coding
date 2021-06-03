package L53_NagarroTest;

public class TreasureInsland {

	public static void main(String[] args) {

		int[][] arr = { { 1, 0, 1 }, { 0, 1, 0 }, { 0, 1, 1 }, { 1, 0, 1 } };
		int[] keys = new int[arr[0].length];

		System.out.println(transureIsland(arr, 0, keys, ""));

	}

	public static int transureIsland(int[][] arr, int bidx, int[] keys, String ans) {

		if (bidx == arr.length) {
			if (keyCheck(keys)) { // System.out.println(ans);
				return 1;
			}
			return 0;
		}
		
		int count = 0;

		// exclude
		count += transureIsland(arr, bidx + 1, keys, ans);

		// include
		// keys change

		for (int i = 0; i < arr.length; i++) {
			keys[i] += arr[bidx][i];
		}
		count += transureIsland(arr, bidx + 1, keys, ans + "B" + bidx + " ");

		// undo
		for (int i = 0; i < arr.length; i++) {
			keys[i] -= arr[bidx][i];
		}

		return count;

	}

	public static boolean keyCheck(int[] keys) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == 0)
				return false;

		}
		return true;

	}

}
