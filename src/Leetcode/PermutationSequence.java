package Leetcode;

import java.util.ArrayList;

public class PermutationSequence {

	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
           int n=3;
//		Permutation(1, 3, "",0);
//		Permutation(2, 3, "",0);
		String input = "";
       for(int i=1;i<=n;i++) {
    	   input+=i;
       }
       
       Permutation(input, "");
		System.out.println(list);

	}

	public static void Permutation(String input, String ans) {

		if (input.length()==0) {
			list.add(ans);
			return;
		}

	
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String roq = input.substring(0, i) + input.substring(i + 1);

			Permutation(roq, ans + ch);
		}
	}

}
