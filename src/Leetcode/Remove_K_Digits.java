package Leetcode;

import java.util.Stack;

public class Remove_K_Digits {

	public static void main(String[] args) {
		System.out.println("op");
		System.out.println(removeKdigits("10200", 2));
		// System.out.println("op");

	}

	public static String removeKdigits(String num, int k) {

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < num.length(); i++) {

			char c = num.charAt(i);

			while (s.size() > 0 && s.peek() > c && k > 0) {
				s.pop();
				k--;
			}
			s.push(c);

		}

		while (k > 0) {
			s.pop();
			k--;
		}

		StringBuilder sb = new StringBuilder();
		boolean bi = true;

		while (s.size() != 0) {
			sb.append(s.pop());
		}
		
		//System.out.println(sb);
		

		sb.reverse();

		while (sb.length() > 0 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		//System.out.println(sb);
		
		
		if (sb.length() == 0)
			return "0";

		return sb.toString();

	}

}
