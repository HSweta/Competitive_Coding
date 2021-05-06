package L6_Func_Arrays;

public class PatternGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int n=5;
		
		int nsp1=0;
		int nst=n;
		int row=1;
		int val=n;
		
		while(row<=2*n+1) {
			if(row<=n)
			 {
					val=n-row+1;
				}
				else {
					val=row-n-1;
				}
			
			for(int csp=1;csp<=nsp1;csp++) {
				System.out.print("  ");
			}
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+" ");
				val--;
			}
			
			System.out.print(0+" ");
			
			int cst=1;
			if(row==n+1)
				cst=2;
			
				
			for(;cst<=nst;cst++) {
				val++;
				System.out.print(val+" ");
				
				
			}
			System.out.println();
			
			if(row<=n) {
				nst--;
				nsp1+=1;
				
				}
			
			else {
				nst++;
				nsp1-=1;
				
				
			}
			
			
			row++;
			

			
		}
	}

}
