package L3_Patterns;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5;
      int row=1;
		
		
		int nst=1;
		int nsp=2*n-3;
		
	    while(row<=n) {
	    	
	          // stars 
	    	  for(int cst=1;cst<=nst;cst++) 
	    		 System.out.print("* ");
	    	  
	    	  //spaces
	    	  for(int csp=1;csp<=nsp;csp++)
	    		 System.out.print("  ");
	    	
	    	  //stars
	    	  int cst=1;
	    	  
	    	  if(row==n)
	    		  cst=2;
	    	  
	    	  for(;cst<=nst;cst++)
	    		 System.out.print("* ");
	    	    
	    	 System.out.println();
	    	 
	    	 nsp-=2;
	    	 nst+=1;
	    	 
	    	row++;
	    } }

	}

