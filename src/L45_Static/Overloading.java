package L45_Static;

public class Overloading {

	public static void main(String[] args) {
		sum(1, 2);
		sum(1, 2, 3);
		sum(4.5, 6.7);
		//sum(1, 2, 3, 4, 5);// variable argument
		sum();

	}

	public static void sum(int a, int b) {
		System.out.println("In 2 Args Sum");
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println("In 3 Args Sum");
		System.out.println(a + b + c);
	}

	public static void sum(double a, double b) {
		System.out.println("In Double Sum");
		System.out.println(a + b);
	}

	public static void sum(int... a) {
		System.out.println("In variable args");
		for (int i : a) {
			System.err.println(i);
		}
	}

	public static void sum(int b, int... a) {
       System.out.println("in val args");
       
	}

}
