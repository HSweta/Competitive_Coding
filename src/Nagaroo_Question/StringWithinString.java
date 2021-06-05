package Nagaroo_Question;

public class StringWithinString {

	public static void main(String[] args) {
		
		String x = "abac";
		String y = "ab";
		
		if(Present(x, y))
			System.out.println("yes");
		else
			System.out.println("no");

	}
	
	public static boolean Present(String x,String y) {
		boolean ans = x.contains(y);
		return ans;
	}

}
