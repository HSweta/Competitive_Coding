package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PlaywithCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();

		ArrayList<Integer> prime = SOE(100000000);

		for (int i = 0; i < n; i++) {
			s1.push(sc.nextInt());
		}

		for (int i = 0; i < q; i++) {

			if (s1.isEmpty())
				break;

			int cur = prime.get(i);

			while (!s1.isEmpty()) {
				int ele = s1.peek();
				System.out.println(ele);
				s1.pop();

				if (ele % cur == 0) {
					s2.push(ele);
					System.out.println("s2 " +ele);	
				}
				else {
					s3.push(ele);
					System.out.println("s3 " +ele);		
				}

			}

			while (!s2.isEmpty()) {
				System.out.println(s2.peek());
				s2.pop();
			}
			
			s1 = s3;
			
//			while (!s3.isEmpty())
//				s3 = new Stack<>();
			
			while (!s3.isEmpty()) {
				System.out.println(s3.peek());
				s3.pop();
			}

		}

	}

	public static ArrayList<Integer> SOE(int n) {

		boolean[] primes = new boolean[n + 1];
		ArrayList<Integer> list = new ArrayList<Integer>();

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; (table * table) <= n; table++) {

			if (primes[table] == false) {
				continue;
			}
			for (int mult = 2; (mult * table) <= n; mult++) {
				primes[mult*table] = false;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (primes[i])
				list.add(i);
		}

		return list;
	}

}
