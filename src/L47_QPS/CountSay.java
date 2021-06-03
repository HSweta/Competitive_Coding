package L47_QPS;

public class CountSay {

	public static void main(String[] args) {

		System.out.println(compress("abbbbccc"));
	}
     
	public static String countAndSay(int n)
	{ 
		if(n==1)
			return "1";
		
		String rr = countAndSay(n-1);
		return compress(rr);
	}
	public static String compress(String str) {

	
		int count = 1;

		String ans = "";

		for (int i = 0; i <= str.length() - 2; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				ans =ans+ count + str.charAt(i);
				count = 1;
			}
		}

		ans = ans + count + str.charAt(str.length() - 1);

		return ans;

	}

}
