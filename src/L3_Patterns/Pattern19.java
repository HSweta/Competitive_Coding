package L3_Patterns;

public class Pattern19 {
	public static void main(String[] args) {
		
		 int n=7;
			int row=1;
			
			
			int nst=n/2+1;
			int nsp=-1;
			
		    while(row<=n) {
		    	
		    	//stars
		    	for(int cst=1;cst<=nst;cst++) {
		    		System.out.print("* ");
		    	}
		    	
		    	//space
		    	for(int csp=1;csp<=nsp;csp++)
		    		System.out.print("  ");
		    	
		    	int cst=1;
		    	if(row==1 || row==n)
		    		cst=2;
		    	//stars
		    	for(;cst<=nst;cst++) {
		    		System.out.print("* ");
		    	}
		    	
		    	System.out.println();
		    	
		    	if(row<=n/2) {
		    		nsp+=2;
		    		nst-=1;
		    	}
		    	else {
		    		nsp-=2;
		    		nst+=1;
		    	}
		    	row++;
		    }
		}

	}


