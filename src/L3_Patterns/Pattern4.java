package L3_Patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=n) {
			
			//work
			//spaces
			for(int csp=nsp;csp>=0;csp--) {
				System.out.print(" ");
			}
			
			//stars
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			
			System.out.println();
			row++;
			nsp--;
			nst++;
		}
		

	}

}
