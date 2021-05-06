package L11_Array2D;

public class Shift_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] matrix= {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                    {9, 10, 11, 12},
                   {13, 14, 15, 16}};
//		int k=2;
//		for(int i=0;i<matrix.length;i++) {
//			rotation(matrix[i],k);
//			
//		}
		
        image(matrix);
}
	
	public static void swap(int[] arr,int k) {
		int i=0;
		int j=arr.length-1;
		
		while(k>0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			k--;
			i++;
			j--;
		}
	}
	
	public static void rotation(int[] arr,int k) {
		k = k%arr.length;
		
		for(int i=k;i>0;i--) {
			
			int temp=arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
	
	public static void image(int[][] mat) {
		int n = mat.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
