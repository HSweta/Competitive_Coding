package L3_Patterns;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int n=5;
		int row=1;
		
        int nst=1;
        int nsp=n-1;
        int val;
        
        while(row<=n) {
        	
        	val = 1;
        	
        	for(int csp=1;csp<=nsp;csp++) {
        		System.out.print("  ");
        	}
        	for(int cst=1;cst<=nst;cst++) {
        		System.out.print(val+" ");
        		if(cst<=nst/2)
        			val++;
        		else
        			val--;
        		
        	}
        	
        	System.out.println();
        	
        	row++;
        	nst+=2;
        	nsp--;
        	
        }
	}

}
