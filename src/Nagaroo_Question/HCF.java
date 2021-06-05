package Nagaroo_Question;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {2,4,8};
       System.out.println(hcf(arr));
	}

	public static int hcf(int[] arr) {

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result = gcd(result, arr[i]);
			if (result == 1)
				return 1;

		}

		return result;
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

}
