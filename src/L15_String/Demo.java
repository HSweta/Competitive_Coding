package L15_String;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n);
		
		//so to consume /n we use sc.nextLine()
		sc.nextLine();
		
		String s = sc.nextLine();// not taking input due to nextInt
		System.out.println(s);
		
		System.out.println("Over");
		

	}

}
