package Question_Session;

import java.util.Arrays;
import java.util.Scanner;

public class K_Unique_Character_Substring {
	 final static int MAX_CHARS = 26; 
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t>0) {
//			int n = sc.nextInt();
//			int arr[]
//		}
		String s = "aabacbebebe";
	    int k = 3;
	    
	    K_Unique(s, k);
		

	}
	
	public static boolean isValid(int[] count,int k) {
		
		int val = 0;
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>0)
				val++;
		}
		
		if(val<=k)
			return true;
		else
			return false;
	}
	 
	public static void K_Unique(String str,int k) {
		
		int u=0;
		int[] count=new int[MAX_CHARS];
		
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)-'a']==0)
				u++;
			count[str.charAt(i)-'a']++;
		}
		
		if(u<k)
			return;
		
		Arrays.fill(count, 0);
		
		int curr_start=0,curr_end=0;
		
		int max_w_size=1;
		
		int max_win_start =0;
		
		count[str.charAt(0)-'a']=count[str.charAt(0)-'a']+1;
		
		for(int i=1;i<str.length();i++) {
			
			count[str.charAt(i)-'a']++;
			curr_end++;
			
			if(!isValid(count, k)) {
				count[str.charAt(curr_start)-'a']--;
			    curr_start++;}
			
			if(curr_end-curr_start+1>max_w_size) {
				max_w_size=curr_end-curr_start+1;
				max_win_start=curr_start;
			}
			
			
		}
		
		System.out.println(max_w_size);
		
		
	}
	
}
