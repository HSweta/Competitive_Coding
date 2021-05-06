package L5_Functions;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
	
	int pos= 1;
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    
    int result=0;
    while(n>0) {
    	int rem=n%10; 
    	
    	result+=pos*Math.pow(10, rem-1);
    	
    	n/=10;
        pos++;
    }
    
    System.out.println(result);
    
}}
