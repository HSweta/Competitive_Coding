package L47_QPS;

public class prefixIndex {

	public static void main(String[] args) {

		int[] arr = {0,1,7,3,6,5,6};
		System.out.println(PrefixIndex3(arr));
	}

	public static int PrefixIndex(int[] arr) {

		int[] prefix = new int[arr.length];
		int[] suffix = new int[arr.length];

		prefix[0] = arr[0];
		suffix[arr.length - 1] = arr[arr.length - 1];

		int idx = -1;

		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (prefix[i] == suffix[i])
				return i;
		}

		return idx;

	}
	
	public static int PrefixIndex3(int[] nums) {
		
		int rs = 0;
		int ls = 0;
		
		for(int i:nums)
			rs=rs+i;
		
		
		for(int i=0;i<nums.length;i++) {
			
			rs=rs-nums[i];
			
			if(ls==rs)
				return i;
			
			ls=ls+nums[i];
		}
		
		return -1;
	}

}
