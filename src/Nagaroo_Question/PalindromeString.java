package Nagaroo_Question;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "Welcome level 71";
		String[] strg = s.split(" ");
		
		int count = 0;
		for (String string : strg) {
			if (isPalidrome(string))
				count++;

		}
		System.out.println(count);
		

	}

	public static boolean isPalidrome(String s) {

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

}
