package L3_Patterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row=1;
		
		
		int nst=1;
		int nsp=n/2;
		
	    while(row<=n) {
	    	
	    	for(int csp=1;csp<=nsp;csp++)
	    		System.out.print("  ");
	    	
	    	for(int cst=1;cst<=nst;cst++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    	
	    	if(row<=n/2) {
	    		nsp-=1;
	    		nst+=2;
	    	}
	    	else {
	    		nsp+=1;
	    		nst-=2;
	    	}
	    	row++;
	    }

	}

}
