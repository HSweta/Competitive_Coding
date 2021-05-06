package L3_Patterns;

public class Pattern3 {
public static void main(String[] args) {
	int n=5;
	
	int nst=n;
	int row=1;
	
	while(row<=n) {
		for(int col=nst;col>=1;col--)
			System.out.print("*");
		
		System.out.println();
		nst--;
		row++;
	}
}
}
