package L3_Patterns;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t=5;
		int row=1;
		int n=2*t-1;
		
		int nst=t;
		int nsp=0;
		
	    while(row<=n) {
	    	
	    	for(int csp=1;csp<=nsp;csp++)
	    		System.out.print("  ");
	    	
	    	for(int cst=1;cst<=nst;cst++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    	
	    	if(row<=t-1) {
	    		nsp+=2;
	    		nst--;
	    	}
	    	else {
	    		nsp-=2;
	    		nst++;
	    	}
	    	row++;
	    }

	}

}
