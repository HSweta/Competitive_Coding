package Nagaroo_Question;

public class Json {

	public static void main(String[] args) {
		System.out.println(maxDepth("{“a” : {“name” : “john”}}"));

	}

	public static int maxDepth(String s) {

		int count = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				count++;
				if (max < count)
					max = count;
			} else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
				if (count > 0)
					count--;
				else
					return -1;
			}

		}

		if (count != 0)
			return -1;
		
		return max;
	}

}
