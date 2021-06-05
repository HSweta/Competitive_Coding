package Nagaroo_Question;

import java.util.regex.Pattern;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("I love Java Programming"));
	}

	public static String reverse(String str) {

		Pattern p = Pattern.compile("\\s");
		String[] temp = p.split(str);

		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				result = temp[i] + result;
				System.out.println(result);
			}

			else {
				result = " " + temp[i] + result;
				System.out.println(result);
			}
		}
		return result;

	}

}
