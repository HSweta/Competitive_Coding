package L13_TimeComplexity;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		SOE(25);

	}
	
	public static void SOE(int n) {
		//nlog(logn)
		
		boolean[] primes = new boolean[n+1];
		
		Arrays.fill(primes, true);
		
		
		
		primes[0]=false;
		primes[1]=false;
		
		for(int table=2;table*table<=n;table++) {
			
			if(primes[table]==false)
				continue;
			
			for(int mult=2;mult*table<=n;mult++) {
				primes[mult*table]=false;
			}
		}
		
		for (int i = 0; i < primes.length; i++) {
			if(primes[i])
				System.out.println(i);
		}
		
	}

}
