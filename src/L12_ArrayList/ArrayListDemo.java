package L12_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> list = new ArrayList<>();
      
      System.out.println(list);
      System.out.println(list.size());
      
      //no. of elements
      
      //add - O(n)
      list.add(10);
      list.add(20);
      list.add(30);
      
      //add(idx,val)-O(n)
      //tc - O(n) in worst case,O(1) in best case
      list.add(1, 50);
      System.out.println(list);
      list.add(3, 100);
      System.out.println(list);
      list.add(3, 400);
      
      
      //get-O(1)
      System.out.println(list.get(0));
      
      //set-update  
      //range:0->size-1
      list.set(0, 100);
      
      //remove
      //tc - O(n) in worst case , O(1) in best case
      System.out.println(list.remove(1));
      
      //print
      for(int i=0;i<list.size();i++) {
    	  System.out.print(list.get(i)+" ");
      }
      
      for(int val:list) {
    	  System.out.print(val+" ");
      }
      
	}

	

}
