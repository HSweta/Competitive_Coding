package L3_Patterns;

public class Pattern11 {
   public static void main(String[] args) {
	   int n=5;
	   
	   int row=1;
	   
	   int nsp=n-1;
	   int nst=1;
	   
	   while(row<=n) {
		   
		   for(int csp=1;csp<=nsp;csp++) 
			   System.out.print("  ");
			   
			   for(int cst=1;cst<=nst;cst++) {
				   if(cst%2==0)
					   System.out.print("! ");
				   else
					   System.out.print("* ");
			   }
			   
			System.out.println();   
			   
			   row++;
			   nsp--;
			   nst+=2;
		   
	   }
}
}
