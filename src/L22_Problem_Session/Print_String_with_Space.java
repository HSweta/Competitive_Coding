package L22_Problem_Session;

public class Print_String_with_Space {

	public static void main(String[] args) {
		String str = "ABC";
		
		print_String(str.substring(1), ""+str.charAt(0));

	}
	
	public static void print_String(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		print_String(ques.substring(1), ans+ques.charAt(0));//without space
		print_String(ques.substring(1), ans+" "+ques.charAt(0));//with space
	}

}
