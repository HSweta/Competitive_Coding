package GFG;

public class TilingProblem {

	public static void main(String[] args) {
      
		System.out.println(TilingRec(4));
	}

	public static int TilingRec(int n) {

		if(n==0 || n==1) {
			return n;
		}
		
		return TilingRec(n-1) + TilingRec(n-2);
	}

}
