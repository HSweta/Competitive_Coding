package Leetcode;

public class CountSortedVowelStrings {

	public static void main(String[] args) {
		System.out.println(CSVSBU(2));

	}
    
	public static int CSVSRec(int n, int idx, int length) {

		if (length == n) {
			return 1;
		}
		
		int ans = 0;
		
		if (length == 0) {
			for (int i = 0; i < 5; i++)
				ans += CSVSRec(n, i, length + 1);

		} else {
			for (int i = idx; i < 5; i++) {
				ans += CSVSRec(n, i, length + 1);
			}
		}
		return ans;
	}
	
	public static int CSVSBU(int n) {
		
		int[][] strg = new int[n+1][6];
		
		for(int i=1;i<=n;i++) {
			for(int j=4;j>=0;j--) {
				if(i==1) {
					strg[i][j] = strg[i][j+1]+1;
				}else	
					strg[i][j] = strg[i-1][j]+strg[i][j+1];
				
							
			
			}
		}
		
		return strg[n][0];
	}
}
