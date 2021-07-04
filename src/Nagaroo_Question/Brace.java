package Nagaroo_Question;

public class Brace {
	public static void main(String[] args) {
		// paste any java program in ""
		String javaCode = "";
		char ch[] = javaCode.toCharArray();
		int open_braces = 0;
		int close_braces = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{')
				open_braces++;
			if (ch[i] == '}')
				close_braces++;
		}
		if (open_braces == close_braces)
			System.out.println("No Braces missing");
		else
			System.out.println("Error:Braces missing");
	}
}
