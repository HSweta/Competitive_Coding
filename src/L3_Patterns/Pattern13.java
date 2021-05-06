package L3_Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		
		int t=5;
		int row=1;
		int n=2*t-1;
		
		int nst=1;
		
		while(row<=n) {
			for( int cst=1;cst<=nst;cst++) {
					System.out.print("* ");
		                 }
			
			System.out.println();
		
			if(row<=t-1) {
		      nst++;
			}
			else {
				nst--;
			}
			row++;
	

	}

}}
