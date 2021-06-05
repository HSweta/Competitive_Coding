package Nagaroo_Question;

public class Electrostatic {

	public static void main(String[] args) {
		int[] arr = {4,3,5};
		char[] s = {'P','N','P'};
		System.out.println(efeild(arr, s));
	}

	public static int efeild(int[] arr, char[] s) {

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'N')
				arr[i] = -1 * arr[i];
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum * 100;

	}

}
