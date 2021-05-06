package Recursion_L17;

public class TickLength {

	public static void main(String[] args) {
		ruler(3,3);

	}
	
public static void pattern(int tl) {
		
		if(tl == 0)
			return ;
		
		//sp
		pattern(tl-1);
		
		//work
		for(int i=1;i<=tl;i++) {
			System.out.print("- ");
		}
		System.out.println();
		pattern(tl-1);
	}

public static void ruler(int inch,int mtl) {
	
	for (int j =1 ; j <=mtl; j++) {
		System.out.print("- ");
	}
	
	System.out.println(0);
	
	for (int i = 1; i <= inch; i++) {
		 
		pattern(mtl-1);
		for (int j =1 ; j <=mtl; j++) {
			System.out.print("- ");
		}
		System.out.println(i);
	}
}

}
