package L3_Patterns;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		
		while(row<=n) {
			int col=1;
			while(col<=n) {
				if(row==col || row+col==n+1) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				col++;

			}
			System.out.println();
				row++;

	} 
	}

}
