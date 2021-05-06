package L13_TimeComplexity;

import java.util.Scanner;

public class Polynomial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int n = sc.nextInt();
	 
		System.out.println(poly2(x,n));
		
	
			
		}
	
	public static int poly1(int x,int n) {
		int result = 0;
		int mult = (int) Math.pow(x, n);
		int i=1;
		while(i<=n) {
			
			result += i*mult;
			mult/=x;
			
			i++;
		}
		
		
		return result;
		
	}

	public static int poly2(int x,int n) {
		
		int mult = x;
		int sum=0;
		for (int coeff = n; coeff>=1;coeff--) {
			
			sum+=coeff*mult;
			
			mult=mult*x;
		}
		
		
		return sum;
		
	}

}
