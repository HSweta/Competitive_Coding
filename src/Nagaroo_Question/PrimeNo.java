package Nagaroo_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNo {

//	 int MAX_SIZE = 1000005;
//
//	ArrayList<Integer> pn = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println(SOE(1));
		
	}

	public static int SOE(int n) {

		int MAX_SIZE = 1000005;

		ArrayList<Integer> pn = new ArrayList<>();
		boolean[] prime = new boolean[MAX_SIZE];

		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;

		for (int table = 0; table < prime.length; table++) {
			if (prime[table] == false)
				continue;

			for (int mult = 2; table * mult < prime.length; mult++) {
				prime[table * mult] = false;
			}

		}
		for (int table = 0; table < prime.length; table++) {
			if (prime[table])
				pn.add(table);
		}

		return pn.get(n-1);
	}
}
