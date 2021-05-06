package Test_Question;

public class Shortest_Palidrome {

	public static void main(String[] args) {
	   System.out.println(ShortestPalidrome("abcd"));	

	}
	
	public static String ShortestPalidrome(String s) {
		
		String r = new StringBuilder(s).reverse().toString();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if(r.substring(i).equals(s.substring(0,n-i))) {
				return r.substring(0,i)+s;
			}
		}
		
		return "";
	}

}
