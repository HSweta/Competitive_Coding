package L3_Patterns;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=5;
		int row=1;
		int nst=1;
		int nsp=n-1;
		
	    while(row<=n) {
	    	
	    	for(int csp=1;csp<=nsp;csp++)
	    		System.out.print("  ");
	    	
	    	for(int cst=1;cst<=nst;cst++) {
	    		if(cst==1 || cst==nst)
	    		    System.out.print(row+" ");
	    		else
	    			System.out.print(0+" ");
	    		
	    	}
	    	System.out.println();
	    	
	    	
	    		nsp-=1;
	    		nst+=2;
	    	
	    	row++;
	    }

	}

}
