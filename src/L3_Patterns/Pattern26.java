package L3_Patterns;

public class Pattern26 {
	
	public static void main(String[] args) {
		int n=5;
	      int row=1;
			
			
			int nst=1;
			int nsp=4;
			
		    while(row<=n) {
		    	
		    	int val=1;
		    	  //spaces
		    	  for(int csp=1;csp<=nsp;csp++)
		    		 System.out.print("  ");
		    
		    	  
		    	  for(int cst=1;cst<=nst;cst++) {
		    		 System.out.print(val +" ");
		    	     val++;
		    	  }
		    	 System.out.println();
		    	 
		    	 nsp-=1;
		    	 nst+=2;
		    	 
		    	row++;
		    } 


	}

}
