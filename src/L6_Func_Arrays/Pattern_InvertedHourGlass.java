package L6_Func_Arrays;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int nsp=2*n-1;
		int nst=1;
		int row=1;
		int k=2*n+1;
		
		while(row<=k) {
		   
			int val=n;
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+" ");
				val--;
			}
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("  ");
			}
			
			int cst=1;
			if(row==n+1) {
				cst=2;
				val=0;
			}
				
			for(;cst<=nst;cst++) {
				val++;
				System.out.print(val+" ");
				
			}
			System.out.println();
			if(row<=n) {
				nst++;
				nsp-=2;}
			
			else {
				nst--;
				nsp+=2;
			}
			
			
			row++;
			
			
			
		}

	}

}
