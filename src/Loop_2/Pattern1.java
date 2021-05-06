package Loop_2;

public class Pattern1 {
public static void main(String[] args) {
	int n=5;
	
	//row
	int row=1;
	
	while(row<=n) {
		
		//work
		int col=1;
		while(col<=n) {
		System.out.print("*");
		col++;
		}
		//change
		System.out.println();
		row=row+1;
		
	}	
}
}
