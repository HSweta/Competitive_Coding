package L3_Patterns;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int row=1;
		
        int nst=1;
        int nsp=n-1;
        int val;
        int r=0;
        
        while(row<=n) {
        	
        	val=n-r;
        	
        	for(int csp=1;csp<=nsp;csp++) {
        		System.out.print("  ");
        	}
        	for(int cst=1;cst<=nst;cst++) {
        		if(cst==nst/2+1) {
        			System.out.print(0+" ");
        			val++;
        		}
        		else {
        		System.out.print(val+" ");
        		
        		if(cst<nst/2)
        			val++;
        		else
        			val--;
        		
        	}}
        	
        	System.out.println();
        	
        	row++;
        	nst+=2;
        	nsp--;
        	r++;
        	
        	
        }
	}

}
