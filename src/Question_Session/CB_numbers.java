package Question_Session;

import java.util.Scanner;

public class CB_numbers {
	
static int[] arr = {2,3,5,7,9,11,13,17,19,23,29};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count=0;
		boolean[] visited=new boolean[str.length()];
		for (int len = 1; len <=str.length(); len++) {
			
			for(int si=0;si<str.length()-len; si++) {
				
				int ei = si+len;
				String ans = str.substring(si,ei);
				System.out.println(ans);
				if(isCB_number(Long.parseLong(ans)) && is_visited(visited,si,ei)) {
					count++;
					// mark
					
					for (int i = si; i < ei; i++) {
						visited[i]=true;
					}
			}
		}
		
	}
	}
	public static boolean is_visited(boolean[] visited,int si,int ei) {
		for (int i = si; i < ei; i++) {
			if(visited[i])
				return false;
		}
		return true;
	}
		
    public static boolean isCB_number(long n) {
	   if(n==0 || n==1)
		  return false;
	   
	   for (int i = 0; i < arr.length; i++) {
		   if(arr[i]==n)
			   return true;}
	   
	   for (int j = 0; j < arr.length; j++) {
		   if(arr[j]%n==0)
			   return false;
	       }
	   return true;

	   
   }

	

}
