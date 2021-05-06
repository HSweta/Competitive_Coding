package Loop_2;

import java.util.Scanner;

public class HCF3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int divident=sc.nextInt();
    int divisor=sc.nextInt();
    
    while(true) {
    	
    int rem= divident % divisor;
    
    if(rem==0)
    	break;
    
    divident = divisor;
    divisor = rem;
        
  } 
   System.out.println(divisor);
 
}
}
