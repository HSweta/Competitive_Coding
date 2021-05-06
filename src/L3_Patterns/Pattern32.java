package L3_Patterns;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int row=1;
		int nst=1;
		int val=1;
		while(row<=2*n-1) {
			
			//stars
			for(int cst =1;cst<=nst;cst++) {
				
				if(cst%2==1)
				 	System.out.print(val+" ");
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
			if(row<=n-1) {
			    nst+=2;
			    val++;}
			else {
				nst-=2;
			    val--;
		      }
			row++;
			}
		

	}

}
