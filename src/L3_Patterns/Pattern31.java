package L3_Patterns;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		
		
	    while(row<=n) {
	    	int val=n;
	    	
	    	for(int col=1;col<=n;col++) {
	    		if(row+col==n+1) {
	    			System.out.print("* ");
	    		}else {
	    		System.out.print(val+" ");
	    		
	    		}
	    		val--;
	    	}
	    	System.out.println();
	   
	    	row++;
	    }
	}

}
