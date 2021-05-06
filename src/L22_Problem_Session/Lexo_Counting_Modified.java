package L22_Problem_Session;

public class Lexo_Counting_Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_Counting(0, 2);

	}
	
	public static void print_Counting(int curr,int n) {
		
		//+ve base case
		if(Integer.toString(curr).length()==n)
		    System.out.println(curr);
		
		//-ve base case
		if(Integer.toString(curr).length()>n) {
			return ;
		}
		
		//System.out.println(curr);
		int i=0;
		int ld = curr%10;
		i=ld+1;
		
		for(;i<=9;i++) {
			print_Counting(curr*10+i, n);
		}
		
		
	}

}
