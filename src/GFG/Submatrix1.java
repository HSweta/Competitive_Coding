package GFG;

import java.util.Iterator;

public class Submatrix1 {
	public static void main(String[] args) {
		  int M[][] = {{0, 1, 1, 0, 1},
                  {1, 1, 0, 1, 0},
                  {0, 1, 1, 1, 0},
                  {1, 1, 1, 1, 0},
                  {1, 1, 1, 1, 1},
                  {0, 0, 0, 0, 0}};
		  
		  System.out.println(SubmatirxDP(M));
	}
	
	public static int SubmatirxDP(int[][] arr) {
		
		int n = arr[0].length;
		int m = arr.length;
		int[][] dp = new int[n+1][m+1];
		int max = 0;
       for(int i=m-1;i>=0;i--) {
    	   for(int j=n-1;j>=0;j--) {
    		   if(arr[i][j]==1) {
    			   dp[i][j] = Math.min(dp[i+1][j], Math.min(dp[i][j+1],dp[i+1][j+1]))+1;
    			   if(max<dp[i][j])
    				   max = dp[i][j];
    		   }
    	   }
       }
       
       return max*max;
       
	}
}
