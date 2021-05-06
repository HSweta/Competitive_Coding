package L15_String;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Sky is Blue";

		String[] arr = str.split(" ");

		for (String st : arr) {
			System.out.println(st);

		}
		String ans = new String();
		for (int i = arr.length - 1; i >= 0; i--)
			ans = ans + arr[i] + " ";
		System.out.println(ans);

		String s = "1538023";
		System.out.println(Maxlen(s));
	}

	public static int Maxlen(String s) {
		int n = s.length();
		int maxlength = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j += 2) {

				int length = j - i + 1;
				int leftsum = 0;
				int rightsum = 0;
				for (int k = 0; k < length / 2; k++) {
					leftsum += (s.charAt(i + k) - '0');
					rightsum += (s.charAt(i + k + length / 2) - '0');
				}

				if (maxlength < length && leftsum == rightsum)
					maxlength = length;
			}
		}

		return maxlength;
	}
}
