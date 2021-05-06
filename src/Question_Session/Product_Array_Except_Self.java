package Question_Session;



public class Product_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,3,4};
		//int[] ans = Product_Array(arr);
		int[] ans  = Product_Array_SO(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}
	
	public static int[] Product_Array(int[] arr) {
		
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		
		left[0]=1;
		right[arr.length-1]=1;
		
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		for (int i = right.length-2; i >=0; i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < left.length; i++) {
			left[i]=left[i]*right[i];
		}
		
		return left;
	}
	
public static int[] Product_Array_SO(int[] arr) {
		
		int[] left=new int[arr.length+1];
		
		
		left[0]=1;
		
		
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		
		
		int r=1;
		
		for(int i=arr.length-1;i>=0;i--) {
			left[i]=left[i]*r;
			r=r*arr[i];
		}
		
		return left;
	}

}
