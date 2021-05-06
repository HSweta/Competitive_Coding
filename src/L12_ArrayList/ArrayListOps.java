package L12_ArrayList;

import java.util.ArrayList;

public class ArrayListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int[] one= {5,6,10,10,10,20,30};
//       int[] two= {10,10,15,20,30};
	
      // System.out.println(intersection(one, two));
	
	   int[] one = {9,8,7,5};
	   int[] two = {9,6,7};
	   
	   System.out.println(addition(one, two));
	   
	
	}
	
	public static ArrayList<Integer> intersection(int[] one,int[] two){
		
		  ArrayList<Integer> ans = new ArrayList<>();
		  
		  int n1=one.length;
		  int n2=two.length;
			  
		  int i=0;
		  int j=0;
		  
		  while(i<n1 && j<n2) {
			  if(one[i]==two[j]) {
				  ans.add(one[i]);
				  i++;
				  j++;
		  }
			  
			  else if(one[i]>two[j])
				  j++;
			  else 
				  i++;
			 
		}

		  return ans;
}
	

    public static ArrayList<Integer> addition(int[] one,int[] two){
    	
    	ArrayList<Integer> ans = new ArrayList<>();
    	
    	int i = one.length-1;
    	int j = two.length-1;
    	
    	int carry = 0;
    
    	
    	while(i>=0 || j>=0) {
    		
    		int sum = carry;
    		
    		if(i>=0) {
    			sum+=one[i];
    			
    			}
    		if(j>=0) {
    			sum+=two[j];
    		}
    		int rem = sum % 10;
    		ans.add(0,rem);
    		
    		carry = sum / 10;
    		
    		i--;
    		j--;
    	}
    
    	if(carry>0)
    		ans.add(0,carry);
    	
    	
  	return ans;
    	
    }
}
