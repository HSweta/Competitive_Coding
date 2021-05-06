package L7_Arrays;

import java.io.InputStream;
import java.util.Scanner;

public class Alexa {
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		int c3=sc.nextInt();
		int c4=sc.nextInt();
		
		int i=0;
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] r = new int[n];
		for(i=0;i<n;i++)
			r[i]=sc.nextInt();
		
         int[] c = new int[m];
		  for(i=0;i<m;i++)
			c[i]=sc.nextInt();
		  
		int ris=0;
		
		for(i=0;i<n;i++) {
			ris+=Math.min(r[i]*c1,c2);
		}
		ris=Math.min(ris, c3);
		
		int cab=0;
		for(i=0;i<m;i++) {
			cab+=Math.min(c[i]*c1,c2);
		}
		
		cab=Math.min(cab, c3);
		
		int result=Math.min(cab, Math.min(ris, c4));
		
		System.out.println(result);
		
		t--;
	}
	}

	
}
