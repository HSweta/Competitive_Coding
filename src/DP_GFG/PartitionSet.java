package DP_GFG;

public class PartitionSet {

	public static void main(String[] args) {
		
		int[] arr = {1,6,11,5};
		System.out.println(PartitionSet(arr, 0, 0, 0));

	}
	
	public static int PartitionSet(int[] arr,int s1,int s2,int vidx) {
		
		if(arr.length==vidx) {
			return Math.abs(s1-s2);
		}
		
		int f = PartitionSet(arr, s1+arr[vidx], s2, vidx+1);
		int s = PartitionSet(arr, s1, s2+arr[vidx], vidx+1);
		
		return Math.min(f, s);
	}

}
