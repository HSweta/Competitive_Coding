package Loop_2;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        int min = Math.min(n1, n2);
        
        int count=min;
        while(count>=1) {
        	
        	if(n1%count==0 && n2%count==0) {
        		System.out.println(count);
        		break;
        	}
        	count--;
        }
	}

}
