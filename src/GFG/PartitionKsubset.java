package GFG;

import java.util.ArrayList;

public class PartitionKsubset {

	static int counter = 0;
	
	public static void main(String[] args) {
		
		int k=2;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i=0;i<k;i++)
			ans.add(new ArrayList<>());
		solution(1, 3, 2, 0,ans);
           System.out.println(counter);
	}

	public static void solution(int i, int n, int k, int nos, ArrayList<ArrayList<Integer>> ans) {
		
		if(i>n) {
			if(nos==k) {
				counter++;
			}
			return;
		}
		for (int j = 0; j < ans.size(); j++) {
			if (ans.get(j).size() > 0) {
				ans.get(j).add(i);
				solution(i+1, n, k, nos, ans);
				ans.get(j).remove(ans.get(j).size() - 1);
			}else {
				ans.get(j).add(i);
				solution(i+1, n, k, nos+1, ans);
				ans.get(j).remove(ans.get(j).size() - 1);
				break;
			}

		}
	}
}
