package Recursion_L17;

import java.util.Iterator;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          System.out.println("Hello");
//          PD(5);
//          System.out.println("Bye");
		// PDI(4);
		// PID(1,5);

		// System.out.println(factorial(5));
		// System.out.println(Power(2,10));

		// System.out.println(Fibonacii(7));
		ruler(3, 4);
		
	}

	// n -> 1 counting
	public static void PD(int n) {

		// base case
		if (n == 0)
			return;

		// work
		System.out.println(n);

		// n-1 -> 1 counting
		PD(n - 1);

	}

	public static void PI(int n) {

		// base case
		if (n == 0)
			return;

		// SP 1-> n-1
		PI(n - 1);
		// work :n print
		System.out.println(n);

	}

//BP 1-> n  1->n
	public static void PDI(int n) {

		if (n == 0)
			return;
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);

	}

	// BP :start -> n n->start
	public static void PID(int start, int n) {

		if (start > n)
			return;
		// SP : start -> n-1 n-1->start
		System.out.println(start);

		PID(start + 1, n);

		System.out.println(start);

	}

	public static int factorial(int n) {

		if (n == 0)
			return 1;
		// SP : (n-1)
		int fnm1 = factorial(n - 1);

		// Self Work
		int fn = fnm1 * n;

		return fn;
	}

	// o(n)
	public static int Power(int b, int e) {

		if (e == 0)
			return 1;

		int sp = Power(b, e - 1);

		int bp = b * sp;

		return bp;
	}

	public static int power2(int x, int n) {

		if (n == 0)
			return 1;

		int sp = power2(x, n / 2);

		int bp;

		if (n % 2 == 0)
			bp = sp * sp;
		else
			bp = sp * sp * x;

		return bp;

	}

	public static int Fibonacii(int n) {

		if (n == 0 || n == 1)
			return n;

		int f1 = Fibonacii(n - 1);
		int f2 = Fibonacii(n - 2);

		return f1 + f2;
	}

	public static void pattern(int tl) {

		if (tl == 0)
			return;

		// sp
		pattern(tl - 1);

		// work
		for (int i = 1; i <= tl; i++) {
			System.out.print("- ");
		}
		System.out.println();
		pattern(tl - 1);
	}

	public static void ruler(int inch, int mtl) {

		for (int j = 1; j <= mtl; j++) {
			System.out.print("- ");
		}

		System.out.println(0);

		for (int i = 1; i <= inch; i++) {

			pattern(mtl - 1);
			for (int j = 1; j <= mtl; j++) {
				System.out.print("- ");
			}
			System.out.println(i);
		}
	}
}
