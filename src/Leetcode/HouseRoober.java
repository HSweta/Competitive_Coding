package Leetcode;

public class HouseRoober {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 1, 2 };
		System.out.println(HRRec(arr,0));

	}

	public static int HRRec(int[] arr, int idx) {

		if (idx >= arr.length)
			return 0;

		int sp1 = HRRec(arr, idx + 2) + arr[idx];
		int sp2 = HRRec(arr, idx + 1);

		return Math.max(sp1, sp2);
	}

	public static int HRBU(int[] arr) {

		int[] strg = new int[arr.length];

		strg[0] = arr[0];
		strg[1] = arr[1];
        int max = Integer.MIN_VALUE;
		for (int i = 2; i < strg.length; i++) {
			
			strg[i] = strg[i - 2] + arr[i];
			
			if(strg[i]>max)
				max = strg[i];
		}
		
		return max;

	}

}
