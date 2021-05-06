package Loop_2;

import java.util.Scanner;

public class HCF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        
	        int min = Math.min(n1, n2);
	        int hcf=0;
	        int count=1;
	        while(count<=min) {
	        	
	        	if(n1%count==0 && n2%count==0) {
	        		hcf=count;
	        	}
	        	count++;
	        }
	        System.out.println(hcf);
		
	}

}
