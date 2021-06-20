package Leetcode;

public class DecodeWays {

	public static void main(String[] args) {
		System.out.println(helper("2101", 0));
		System.out.println(helperBU("2101"));
	}

//	public static int decodeWays(String s) {
//       
//	}

	public static int helper(String s, int p) {

		if (p == s.length()) {
			return 1;
		}

		if (s.charAt(p) == '0')
			return 0;

		int res = helper(s, p + 1);

		if (p < s.length() - 1 && (s.charAt(p) == '1' || s.charAt(p) == '2') && s.charAt(p + 1) <= '6') {
			res += helper(s, p + 2);
		}

		return res;
	}

	public static int helperBU(String s) {

		if (s.charAt(0) == '0' || s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;

		int count1 = 1, count2 = 1;

		for (int i = 1; i < s.length(); i++) {
			int d = s.charAt(i) - '0';
			int dd = (s.charAt(i - 1) - '0') * 10 + d;
			int count = 0;
			if (d > 0)
				count += count2;
			if (dd >= 10 && dd <= 26)
				count += count1;
		}
		
		return count1;

	}
}
