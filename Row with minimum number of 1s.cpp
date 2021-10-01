/*
Given a 2D binary matrix A of dimensions NxM, determine the row that contains a minimum number of 1's.

Note-The matrix contains only 1s and 0s. 
Also, if two or more rows contain the minimum number of 1's, 
the answer is the lowest of those indices.

*/




#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int minRow(int N, int M, vector<vector<int>> A) {
        int s=0;
        int maxi=9999999,ans=1;
        for(int i=0;i<A.size();i++)
         {
             vector<int>str=A[i];
             s=count(str.begin(), str.end(),1);
             if(s<maxi)
             {
                 maxi=s;
                 ans=(i+1);
             }
         }
         return ans;
         
    }
};


/* Input:
	N=4,M=4
	A=[[1,1,1,1],[1,1,0,0],[0,0,1,1],[1,1,1,1]]
	Output:
	2
	Explanation:
	Rows 2 and 3 contain the minimum number 
	of 1's(2 each).Since, 2 is less than 3.
	Thus, the answer is 2.
*/

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, M;
        cin >> N >> M;
        vector<vector<int>> A(N, vector<int>(M));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                cin >> A[i][j];
            }
        }
        Solution ob;
        cout << ob.minRow(N, M, A) << "\n";
    }
}  
