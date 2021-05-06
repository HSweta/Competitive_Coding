package L3_Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5;
		
		int row=1;
		
		while(row<=n) {
			int col=1;
			while(col<=n) {
				if(row==1 || row==n || col==1 || col==n) { 
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
