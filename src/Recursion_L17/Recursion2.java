package Recursion_L17;

import java.util.Iterator;

public class Recursion2 {

	public static void main(String[] args) {
		
	  int[]	arr= {100,20,30,40,50};
      int[] a = {10,50,30,50,30,30,60};
      
	  //display(arr,0);
      
	  //reverseDisplay(arr, 0);
      
	  //System.out.println(max(arr,0));
      
	  //System.out.println(firstOccIndex(a, 0, 30));
      
      //System.out.println();
      
      //System.out.println(LastOccIndex(a, 0, 30));
     
      int[] rr = AllIndexes(a, 30, 0, 0);
      for (int i = 0; i < rr.length; i++) {
    	  System.out.println(rr[i] + " ");
		
	}
	}
	public static void display(int[] arr,int vidx) {
		
		if(vidx==arr.length)
			return;
		
		System.out.print(arr[vidx]+" ");
		
		display(arr,vidx+1);
	}
    
    public static void reverseDisplay(int[] arr,int vidx) {
		
		if(vidx==arr.length)
			return;
			
		reverseDisplay(arr,vidx+1);
		
		System.out.print(arr[vidx]+" ");
		
	}
    
    public static int max(int[] arr,int vidx) {

    	if(vidx==arr.length)
		     return Integer.MIN_VALUE;
    	
        int sp = max(arr,vidx+1);
        
        int bp = Math.max(arr[vidx], sp);
        
        return bp;
        
    }
    
    public static int max1(int[] arr,int vidx) {

    	if(vidx==arr.length-1)
		     return arr[arr[arr.length-1]];
    	
        int sp = max1(arr,vidx+1);
        
        int bp = Math.max(arr[vidx], sp);
        
        return bp;
        
    }
    
    public static int firstOccIndex(int[] arr,int vidx,int item) {
    	
    	if(vidx==arr.length)
    		return -1;
    	
    	if(item == arr[vidx])
		    return vidx;

        int sp = firstOccIndex(arr,vidx+1,item);
        
        return sp;
    	
    	//return firstOccIndex(arr,vidx+1,item);
    	
    }
    public static int lastOccIndex(int[] arr, int item, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		int sp = lastOccIndex(arr, item, vidx + 1);

		if (arr[vidx] == item && sp == -1) {
			return vidx;
		}

		return sp;

	}
    
 public static int[] AllIndexes(int[] arr,int item,int vidx,int count) {
    	
	 if(vidx==arr.length) {
		 int[] br = new int[count];//heap so it wil not destory in with destory of stack
 		 return br;
	 }
	
	 int[] rr;
			 
     if(item == arr[vidx]) {
    	 rr= AllIndexes(arr, item, vidx+1, count+1);
    	rr[count]=vidx;
    	return rr;
     }else {
    	 rr = AllIndexes(arr,item,vidx+1,count); 
    	 return rr;
     }
 
 }
 
// public static int[] AllIndexes1(int[] arr,int item,int vidx,int count) {
// 	
//	 if(vidx==arr.length)
// 		return new int[count+1];
//    	
//     if(item == arr[vidx]) {
//    	count++;
//		 int[] ans=null;
//		ans[count]=vidx;
 
//     }
//  int[] ans = AllIndexes1(arr, item, vidx+1, count);
//    	return ans;
//    }
}
