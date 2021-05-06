package L15_String;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//create
		Scanner sc = new Scanner(System.in);
		
		//string -> stringbulder
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		
		//length
		System.out.println(sb.length());
		
		//print
		System.out.println(sb);
		
		//char obtain
		System.out.println(sb.charAt(4));
		
		//set
		sb.setCharAt(1, 'a');
		System.out.println(sb);
		
		//insert
		sb.insert(sb.length(), "bye");
		System.out.println(sb);
		
		//append
		sb.append("code");
		System.out.println(sb);
		
		//remove
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		sb.delete(3, 7);
		System.out.println(sb);
		
		//substring
		System.out.println(sb.substring(4));
		
		//convert sb to string
		String s = sb.toString();
		System.out.println(s);
		
		long start = System.currentTimeMillis();
	    append();
	    long end = System.currentTimeMillis();
	    
	    System.out.println(end-start);
		
	}
public static  void append() {
		
		int n=100000;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <=n; i++) {
			sb.append(i);
		}

}}
