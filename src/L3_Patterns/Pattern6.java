package L3_Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		
        int nst=n;
        int nsp=0;
        
        while(row<=n) {
        	
        	for(int csp=1;csp<=nsp;csp++) {
        		System.out.print("  ");//two space tp make it look clear
        	}
        	for(int cst=1;cst<=nst;cst++) {
        		System.out.print("* ");//extra space for clear appearance
        	}
        	
        	System.out.println();
        	row++;
        	nsp+=2;
        	nst--;
        	
        }
        
        
	}

}
