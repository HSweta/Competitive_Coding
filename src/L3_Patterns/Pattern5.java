package L3_Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        
        int row=1;
        int nst=n;
        int nsp=0;
        
        while(row<=n) {
        	
        	for(int csp=1;csp<=nsp;csp++) {
        		System.out.print(" ");
        	}
        	for(int cst=1;cst<=nst;cst++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        	row++;
        	nsp++;
        	nst--;
        	
        }
	}

}
