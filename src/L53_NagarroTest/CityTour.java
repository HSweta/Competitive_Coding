package L53_NagarroTest;

public class CityTour {

	public static void main(String[] args) {

		int[][] arr = { { 0, 2, 3 }, { -1, 1, 1 }, { 6, 1, 2 } };

		cityTour(arr);
	}

	public static int cityTour(int[][] arr) {

		int p1 = cityTour1(arr, 0, 0, arr.length - 1, arr[0].length - 1, new String[arr.length][arr[0].length]);
		return p1;

	}

	public static int cityTour1(int[][] arr, int row, int col, int er, int ec, String[][] pathTrack) {

		if (row == er && col == ec) {
			return arr[row][col];
		}

		if (row > er && col > ec || arr[row][col] == -1) {
			return Integer.MIN_VALUE;
		}

		int hp = cityTour1(arr, row, col + 1, er, ec, pathTrack);
		int vp = cityTour1(arr, row + 1, col, er, ec, pathTrack);

		int max = Math.max(hp, vp);

		if (max == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		pathTrack[row][col] = hp == max ? "H" : "V";

		return max + arr[row][col];
	}

}
