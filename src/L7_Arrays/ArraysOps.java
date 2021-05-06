package L7_Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArraysOps {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr= takeInput();
		// int[] arr= {5,7,12,20,28,30,40,50,60,70,75,80,90,9,95,97};

		// int[] arr = {-10,20,-30,40};
		int[] arr = { 2, 3, -6, 1, 2, 3, -4, 5, -10, 6 };
		int[] a = { 3, 4, 5, 6, 7 };
		System.out.println(noOfTriangle2(a));
		// System.out.println(kadane(arr));
		// display(inverse(arr));
//		
//		System.out.println("-----maximum-----");
//		System.out.println(maximum(arr));
//		
//		System.out.println("-----find-----");
//		System.out.println(find(arr, 90));
//		
//		System.out.println("-----BinarySearch-----");
//		System.out.println(binarySearch(arr, 70));
//		
//		System.out.println("----Reverse----");
//		reverse(arr);
//		display(arr);	

		// rotation(arr,4);
		// display(arr);
		// barGraph(arr);
		// subarrayPrint(arr);
		// subarraySum3Loops(arr);
		// subarraySum2Loops(arr);
		// subarraySumMax(arr);
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] ?");
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {

		System.out.println("----Display----");
		for (int i : arr) {
			System.out.print(i + " ");

			System.out.println();

		}
	}

	public static int maximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}

	public static int find(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (item == arr[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] < item) {
				lo = mid + 1;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;
	}

	public static void reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void reverse(int[] arr, int lo, int hi) {

		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}

	}

	public static void rotation(int[] arr, int rot) {

		rot = rot % arr.length;

		for (int r = 1; r <= rot; r++) {
			// single rotation
			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j >= 1; j--)
				arr[j] = arr[j - 1];

			arr[0] = temp;
		}
	}

	public static void rotate(int[] arr, int rot) {

		rot = rot % arr.length;

		int rev = arr.length - rot - 1;

		reverse(arr, 0, rev);// arr.length-rot

		reverse(arr, arr.length - rot, arr.length - 1);

		reverse(arr);

	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			res[arr[i]] = i;
		}

		return res;
	}

	public static void barGraph(int[] arr) {

		int rows = maximum(arr);
		int cols = arr.length;

		for (int r = 1; r <= rows; r++) {

			for (int c = 0; c < cols; c++) {

				if (r <= rows - arr[c])
					System.out.print("  ");
				else
					System.out.print("| ");
			}

			System.out.println();

		}

	}

	public static void subarrayPrint(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}

				System.out.println();
			}

		}
	}

	public static void subarraySum3Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {
				int sum = 0;
				for (int k = si; k <= ei; k++) {
					sum += arr[k];
				}

				System.out.println(sum);
			}

		}
	}

	public static void subarraySum2Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {
			int sum = 0;
			for (int ei = si; ei <= arr.length - 1; ei++) {
				sum += arr[ei];
				System.out.println(si + "," + ei + ":" + sum);

			}

		}

	}

	public static void subarraySumMax(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int si = 0; si <= arr.length - 1; si++) {

			int sum = 0;

			for (int ei = si; ei <= arr.length - 1; ei++) {

				sum += arr[ei];

				if (sum > max)
					max = sum;

			}

		}

		System.out.println(max);

	}

	public static int kadane(int[] arr) {

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

	public static int kadansSumIndex(int[] arr) {

		int sum = arr[0];
		int max = arr[0];

		int[] start = new int[arr.length];

		int ei = 0;
		for (int i = 1; i < arr.length; i++) {

			if (sum + arr[i] >= arr[i])
				start[i] = start[i - 1];
			else
				start[i] = i;

			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max) {
				max = sum;
				ei = i;
			}

		}

		// index of max sub array
		System.out.println(start[ei] + " " + ei);

		return max;
	}

	public static int circularArrayMaxSubarraySum(int[] arr) {

		// case 1:CE are not wrapping
		int cenotWrapping = kadane(arr);

		// case 2:CE are wrapping
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		int nonContributingELementSum = kadane(arr);

		int ceWrapping = totalSum + (nonContributingELementSum);

		return Math.max(cenotWrapping, ceWrapping);
	}

	public static int noOfTriangle(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[i] + arr[k] > arr[j]) {
						count++;

						// System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}

				}
			}
		}
		return count;
	}

	public static int noOfTriangle1(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] > arr[k]) {
						count++;

						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}

				}
			}
		}
		return count;
	}

	public static int noOfTriangle2(int[] arr) {
		Arrays.sort(arr);

		int count = 0;

		// arr[i] is the largest size as of now
		for (int i = arr.length - 1; i >= 0; i--) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[l] + arr[r] > arr[i]) {
					count += r - l;

					// for printing side

					// for(int k=l;k<=r-1;k++)
					// System.out.println(arr[k]+" "+arr[r]+" "+arr[i]);
					r--;
				} else {
					l++;
				}
			}

		}

		return count;
	}
}
