package Question_Session;

import java.util.Scanner;

public class Sum_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			System.out.println(sumOfString(str));
			
		}
		}
				
   public static long sumOfString(String str) {
	   
	   long sum=0;
	   String temp ="0";
	   
	   for (int i = 0; i < str.length(); i++) {
		  char ch = str.charAt(i);
		  if(Character.isDigit(ch)) {
			  temp+=ch;
		  }
		  else {
			  sum+=Long.parseLong(temp);
			  temp="0";
		  }
		
	   }
     
	   sum+=Long.parseLong(temp);
	   return sum;
   
   }


}
