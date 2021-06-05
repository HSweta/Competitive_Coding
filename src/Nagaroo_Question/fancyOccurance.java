package Nagaroo_Question;

public class fancyOccurance {

	public static void main(String[] args) {
		String s = "Welcome Mette";
		System.out.println(removeOccurance(s, 'l'));

	}

	public static String removeOccurance(String s, char c) {
		int i = 0;
		int j = 0;

		char[] t = s.toCharArray();
		int count = 0;

		for (i = 0; i < t.length; i++) {
			if (t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}

		while (count > 0) {
			t[j++] = '\0';
			count--;
		}
		
		return String.valueOf(t);

	}

}
