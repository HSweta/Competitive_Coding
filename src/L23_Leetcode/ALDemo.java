package L23_Leetcode;

import java.util.ArrayList;

public class ALDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
//		ArrayList<Integer> temp1 = new ArrayList<>();
//		temp1.add(10);
//		temp1.add(20);
//		
//		list.add(temp1);
//		
//		ArrayList<Integer> temp2 = new ArrayList<>();
//		temp1.add(60);
//		temp1.add(80);
//		
//		list.add(temp1);
		
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(10);
		temp1.add(20);
		
		list.add(temp1);
		
		temp1 = new ArrayList<>();
		temp1.add(60);
		temp1.add(80);
		
		list.add(temp1);
		
		
		System.out.println(list);
		
		//copy content of arraylist
		
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
		
		ArrayList<Integer> t = new ArrayList<>();
		t.add(10);
		t.add(20);
		
		list1.add(t);
		
		ArrayList<Integer> t1 = t;//no new arraylist is created it is only a reference variable
		
		// for that we have to do like this
		ArrayList<Integer> t2 = new ArrayList<>();
		
		for(int q:t) {
			t2.add(q);
			
		}
		
		list1.add(t2);
		
		//to copy the arraylist
		ArrayList<Integer> t3 = new ArrayList<>(t1);
		
		ArrayList<ArrayList<Integer>> Blist = new ArrayList<>();
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		temp.add(10);
		temp.add(20);
		
		Blist.add(new ArrayList<>(temp));
		
		temp.add(30);
		temp.add(40);
		
		Blist.add(new ArrayList<>(temp));
		
		temp.add(50);
		
		Blist.add(new ArrayList<>(temp));
		
		
		System.out.println(Blist);
		
		
		
		
	}

}
