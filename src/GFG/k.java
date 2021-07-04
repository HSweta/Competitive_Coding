package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k {
	
	static int[] count;

	public static void main(String[] args) {
		
//		int[] arr = { 80, 10, 50, 30, 60, 20, 70, 25 };
//
//		int[] res = mergeSort(arr, 0, arr.length - 1);
//
//		for (int val : res)
//			System.out.print(val + " ");
		
		List<Integer> l = Arrays.asList(0);
		System.out.println(l);
		
		System.out.println(1<<0);
		
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] bc = new int[1];
			bc[0] = arr[lo];
			return bc;
		}

		int mid = (lo + hi) / 2;
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] res = mergeTwoSortedArray(fh, sh);

		return res;

	}

	public static int[] mergeTwoSortedArray(int[] fh, int[] sh) {

		int[] merged = new int[fh.length + sh.length];

		int i = 0, j = 0, k = 0;

		while (i < fh.length && j < sh.length) {

			if (fh[i] < sh[j]) {
				merged[k] = fh[i];
				i++;
			} else {
				merged[k] = sh[j];
				j++;
			}
			k++;
		}

		while (i < fh.length) {
			merged[k] = fh[i];
			i++;
			k++;
		}

		while (j < sh.length) {
			merged[k] = sh[j];
			j++;
			k++;
		}

		return merged;

	}

	public static void sort(int[] arr, int[] Original, int lo, int hi) {

		if (lo < hi) {
			int mid = (lo + hi) / 2;
			sort(arr, Original, lo, mid);
			sort(arr, Original, mid + 1, hi);
			merge(arr, Original, lo, mid, hi);
		}
	}

	public static void merge(int[] arr, int[] original, int lo, int mid, int hi) {

		int lsize = mid - lo + 1;
		int rsize = hi - mid;

		int[] lArr = new int[lsize];
		int[] rArr = new int[rsize];

		for (int i = 0; i < lsize; i++) {
			lArr[i] = original[i + lo];
		}

		for (int i = 0; i < rsize; i++) {
			rArr[i] = original[mid + 1 + i];
		}

		int i = 0, j = 0, k = lo, countRight = 0;

		while (i < lsize && j < rsize) {
			if (arr[lArr[i]] <= arr[rArr[j]]) {
				original[k] = lArr[i];
				count[lArr[i]] += countRight;
				i++;
			} else {
				original[k] = rArr[j];
				j++;
				countRight++;

			}

			k++;
		}

		while (i < lsize) {
			count[lArr[i]] += countRight;
			i++;
			k++;
		}

		while (j < rsize) {
			original[k] = rArr[j];
			j++;
			k++;
		}

	}

	public List<Integer> countSmaller(int[] nums) {
		List<Integer> result = new ArrayList<>();
		count = new int[nums.length];

		int[] originalIndex = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			originalIndex[i] = i;
		}

		sort(nums, originalIndex, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++) {
			result.add(count[i]);
		}

		return result;
	}
}
