package Nagaroo_Question;

public class LoveLetter {

	public static void main(String[] args) {
		System.out.println(word("llohe ereth", 5));
		System.out.println(word("adaada", 3));
	}

	public static int rotatedWords(String input1, int input2) {
		int count = 0;
		String arr[] = input1.split(" ");
		if (input1 != null && !input1.isEmpty()) {
			for (int i = 0; i < arr.length; i++) {
				// System.out.println("Orginal Word :" + arr[i]);
				int start = arr[i].length() - input2;
				String s1 = arr[i].substring(start);
				// System.out.println("s1 : " + s1);
				String s2 = arr[i].substring(0, start);
				// System.out.println("s2 : " + s2);
				// System.out.println("New Word : " + s1 + s2);
				if ((s1 + s2).equalsIgnoreCase(arr[i])) {
					count++;
				}
			}
		}
		return count;
	}

	public static int word(String s1, int s2) {

		int count = 0;
		String arr[] = s1.split(" ");

		if (s1 != null && !s1.isEmpty()) {
			for (int i = 0; i < arr.length; i++) {
				String f = r(arr[i].substring(0, s2));
				String l = r(arr[i].substring(s2));
				String fs = r(f + l);

				if (fs.equalsIgnoreCase(arr[i]))
					count++;

			}
		}

		return count;
	}

	public static String r(String s) {
		StringBuilder input1 = new StringBuilder(s);
		return input1.reverse().toString();

	}

}
