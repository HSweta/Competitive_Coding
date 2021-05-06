package L22_Problem_Session;

import java.util.Scanner;

public class happy_Number_Leetcode {
static int count = 0;
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(is_Happy_number(n)) {
			System.out.println(count);
		}
		else
			System.out.println(-1);
		
	}

	public static boolean is_Happy_number(int n) {
		if (n == 1)
			return true;
		if (n != 7 && n < 10) {
			return false;
		}
		return is_Happy_number(new_nmber(n));
	}

	public static int new_nmber(int n) {
		int new_num = 0;
		while (n > 0) {
			int rem = n % 10;
			new_num += (rem * rem);
			n /= 10;
		}

		return new_num;
	}

}
