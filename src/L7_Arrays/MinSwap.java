package L7_Arrays;

public class MinSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	arr[] = {7, 1, 3, 2, 4, 5, 6 };
		System.out.println(min(arr));

	}
	public static int min(int[] arr) {
		int n=arr.length;
		int i=0;
		int count=0;
		while(i<n) {
			int temp=0;
			if(arr[i]!=(i+1)) {
				while(arr[i]!=i+1) {
					temp=arr[arr[i]-1];
					arr[arr[i]-1]=arr[i];
					arr[i]=temp;
					count++;
				}
			}
			i++;
		}
		return count;
	}

}
