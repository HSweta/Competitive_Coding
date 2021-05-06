
package L21_Recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class Recursion3 {

	public static void main(String[] args) {
		// subsequence_Print("abc", "");
		 KPC("145","");
		// coinToss(3, "");
		// ValidParathesis(3, 0, 0, "");
		// climbingStair(0, 5, "");
		// MazePath(0, 0, 2, 2, "");
		// Permutation("abc", "");
		// coinTossNoConsecuiveHead(3, "", false);
		// lexicoCounting(0, 1000);
		jumpingNumbers(0, 20);
		//palidomicPartitions("nitin", "");
		 System.out.println();

	}

	public static void subsequence_Print(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0); // a
		String roq = ques.substring(1); // bc

		subsequence_Print(roq, ans); // bc , _
		subsequence_Print(roq, ans + ch);// bc,a
	}

	public static void subsequenceAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0); // a
		String roq = ques.substring(1); // bc

		subsequenceAscii(roq, ans); // bc , _
		subsequenceAscii(roq, ans + ch);// bc,a
		subsequenceAscii(roq, ans + (int) ch);
	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static void KPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {

			KPC(roq, ans + code.charAt(i));
		}

	}

	public static void KPC2(String str) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("");

		for (int i = 0; i < str.length(); i++) {// 145

			ArrayList<String> n1 = new ArrayList<String>();

			String code = getCode(str.charAt(i));

			for (String val : list) {// list // a b c

				for (int j = 0; j < code.length(); j++) { // option

					n1.add(val + code.charAt(j)); // aj ak bj cj ck
				}

			}

			list = n1;
		}
		System.out.println(list);
	}

	public static void coinToss(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		coinToss(n - 1, ans + "H");
		coinToss(n - 1, ans + "T");
	}

	public static void ValidParathesis(int n, int open, int close, String ans) {

		// +ve bc
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		// -ve bc
		if (open > n || close > open)
			return;

		ValidParathesis(n, open + 1, close, ans + "(");
		ValidParathesis(n, open, close + 1, ans + ")");
	}

	public static void climbingStair(int src, int des, String ways) {

		if (src == des) {
			System.out.println(ways);
			return;
		}

		if (src > des) {
			return;
		}

		climbingStair(src + 1, des, ways + "1");
		climbingStair(src + 2, des, ways + "2");
		climbingStair(src + 3, des, ways + "3");

	}

	public static void ClimbingStairs(int curr, int n, String ans) {

		if (curr == n) {
			System.out.println(ans);
			return;
		}

		if (curr > n) {
			return;
		}

		ClimbingStairs(curr + 1, n, ans + "1");
		ClimbingStairs(curr + 2, n, ans + "2");
		ClimbingStairs(curr + 3, n, ans + "3");

	}

	public static void ClimbingStairs1(int curr, int n, String ans) {

		if (curr == n) {
			System.out.println(ans);
			return;
		}

		if (curr > n) {
			return;
		}

		// for 1-3 steps
		for (int step = 1; step <= 3; step++) {
			ClimbingStairs(curr + step, n, ans + step);
		}

	}

	public static void MazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er & cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec)
			return;

		MazePath(cr, cc + 1, er, ec, ans + "H"); // column changes
		MazePath(cr + 1, cc, er, ec, ans + "V"); // row changes
	}

	public static void MazePathDiagonal(int cr, int cc, int er, int ec, String ans) {

		if (cr == er & cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec)
			return;

		MazePath(cr, cc + 1, er, ec, ans + "H"); // column changes
		MazePath(cr + 1, cc, er, ec, ans + "V"); // row changes
		MazePath(cr + 1, cc + 1, er, ec, ans + "D");

	}

	public static void Permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			Permutation(roq, ans + ch);
		}
	}

	public static void coinTossNoConsecuiveHead(int n, String ans, boolean flag) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (flag) {// last element was head
			coinTossNoConsecuiveHead(n - 1, ans + "T", false);
		} else { // last element is tail
			coinTossNoConsecuiveHead(n - 1, ans + "H", true);
			coinTossNoConsecuiveHead(n - 1, ans + "T", false);
		}

	}

	public static void lexicoCounting(int curr, int n) {

		if (curr > n) {
			return;
		}
		System.out.println(curr);

		int i = 0;

		if (curr == 0)
			i = 1;

		while (i <= 9) {

			lexicoCounting(curr * 10 + i, n);
			i++;
		}

	}

	public static void jumpingNumbers(int curr, int n) {

		if (curr > n)
			return;

		System.out.println(curr);

		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				jumpingNumbers(i, n);
			}
		}

		else {

			int rem = curr % 10;

			if (rem != 0) {
				jumpingNumbers(curr * 10 + (rem - 1), n);
			}

			if (rem != 9) {
				jumpingNumbers(curr * 10 + (rem + 1), n);
			}

		}
	}

	public static void palidomicPartitions(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;

		}
		

		for (int i = 1; i <= ques.length(); i++) { // 1->ques.length()

			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (isPalidrome(part))
				palidomicPartitions(roq, ans + part + " ");
		}
	}

	public static boolean isPalidrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

}
