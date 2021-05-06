package L6_Func_Arrays;

public class Matrix_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
		
		matrix(mat, 4, 29);
	}
	
	public static void matrix(int[][] arr,int n,int x){

		int i=0;
		 int j=n-1;

		 while(i<n && j>=0){


			 if(arr[i][j]==x){
				 System.out.println(1);
				 return ;
			 }
			 else if(arr[i][j]>x)
			   j--;

			 else{
				 i++;
			 }   

		 }

		 System.out.println(0);
         return;

	}

}
