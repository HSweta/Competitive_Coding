package L11_Array2D;

public class Array2D_Demo {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		// 1st row print
		int[] a = arr[1];
		
		for(int val:a)
			System.out.println(val+" ");
		System.out.println();
		
		//entire 2D array print
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				System.out.print(arr[r][c]+" ");
				
			}
			System.out.println();
		}
			
	     System.out.println("---JA---");
	     
	     int[][] jarr = new int[3][];//intial value is null
	     
	     System.out.println(jarr);
	     
	     System.out.println(jarr[0]);
	     System.out.println(jarr[1]);
	     System.out.println(jarr[2]);
	     
	     jarr[0]=new int[4];
	     jarr[1]=new int[2];
	     jarr[2]=new int[3];
	     
	     System.out.println(jarr[0]);// now it store address 
	     System.out.println(jarr[1]);
	     System.out.println(jarr[2]);
	     
	}

}
