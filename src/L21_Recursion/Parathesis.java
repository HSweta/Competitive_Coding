package L21_Recursion;

public class Parathesis {

	public static void main(String[] args) {
		//par(3,3,"");
		

	}
	
	public static void par(int l,int r,String ans) {
		if(l==0 && r==0) {
			System.out.println(ans);
			return;
		}
		if(l<0 || r <0 || l>r)
			return;
		
		
		par(l-1,r,ans+"(");
		par(l,r-1,ans+")");
	}
	
	public static void binary(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return ;
			}
		char ch = str.charAt(0);
		String roq = str.substring(1);
		
		if(ch=='?') {
			binary(roq,ans+"1");
			binary(roq,ans+"0");
			
		}
		else {
			binary(roq,ans+ch);
		}
	}

}
