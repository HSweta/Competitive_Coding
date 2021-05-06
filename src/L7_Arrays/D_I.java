package L7_Arrays;

public class D_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printMin(String arr) {
		
		int curr_max=0;
		
		int last_entry=0;
		
		int j;
		
		for(int i=0;i<arr.length();i++) {
			
			int noOfNextD=0;
			
			switch(arr.charAt(i)) {
			
			case 'I':
				
				j=i+1;
				while(j<arr.length() && arr.charAt(j)=='D') {
					noOfNextD++;
					j++;
				}
				if(i==0) {
					curr_max=noOfNextD+2;
					System.out.print(" "+ ++last_entry);
					System.out.print(" "+curr_max);
					last_entry=curr_max;
				}
				else {
					curr_max+=noOfNextD+1;
					last_entry=curr_max;
					
					System.out.print(" "+last_entry);
					
				}
				
				for(int k=0;k<noOfNextD;k++) {
					System.out.print(" "+ --last_entry);
					i++;
				}
				break;
				
			case 'D':
				if(i==0) {
					j=i+1;
				
				while (j < arr.length()&&arr.charAt(j) == 'D') 
                {
                    noOfNextD++;
                    j++;
                }
				curr_max=noOfNextD+2;
				
				System.out.println(" "+curr_max+" "+(curr_max-1));
				
				last_entry=curr_max-1;
			}
				else {
					System.out.print(" "+(last_entry-1));
					last_entry--;
				}
				break;
		}
	}
  System.out.println();
}}
