package L6_Func_Arrays;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=7;
		int nsp1=n-1;
		int nsp2=-1;
		int nst=1;
		int row=1;
		int val=1;
		
		while(row<=n) {
			
			if(row<=n/2+1)
		 {
				val=row;
			}
			else {
				val=n-row+1;
			}
			for(int csp=1;csp<=nsp1;csp++) {
				System.out.print("  ");
			}
			
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+" ");
				val--;
			}
			
			for(int csp=1;csp<=nsp2;csp++) {
				System.out.print("  ");
			}
			
			
			int cst=1;
			if(row==1 || row==n)
				cst=2;
			
				
			for(;cst<=nst;cst++) {
				val++;
				System.out.print(val+" ");
				
			}
			System.out.println();
			
			if(row<=n/2) {
				nst++;
				nsp1-=2;
				nsp2+=2;
				}
			
			else {
				nst--;
				nsp1+=2;
				nsp2-=2;
				
			}
			
			
			row++;
			

			
		}
	}

}
