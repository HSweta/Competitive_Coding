package L23_Leetcode;

import java.util.ArrayList;

public class _60_Permutation_Sequence {

	public static void main(String[] args) {
        ArrayList<String> temp = new ArrayList<>();
        
        System.out.println(getPermutation(3,3));
        
	}

	public static void permutation1(String ques, String ans, ArrayList<String> temp) {

		if (ques.length() == 0) {
			temp.add(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String req = ques.substring(0,i)+ques.substring(i+1);
            permutation1(req, ans+c,temp);
		}
	}
	
   public static String getPermutation(int n,int k) {
		
		int[] fact = new int[n];
		fact[0] = 1;
		for(int i=1;i<fact.length;i++) {
			fact[i]=fact[i-1]*i;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<=n;i++) 
			list.add(i);
		
		return permutation(n, k, fact, list, "");
	
		
		
	}
   
	public static String permutation(int n,int k,int[] fact,ArrayList<Integer> list,String ans) {
		
		if(n==0) {
			return ans;
		}
		int group= k /fact[n-1]; 
		
		if(k % fact[n-1] != 0) {
			 group++;
		}
		
		int newk = k - (group-1)*fact[n-1];
		
		int val = list.remove(group);
		
		return permutation(n-1, newk, fact, list, ans+val);
		  
	}
}
