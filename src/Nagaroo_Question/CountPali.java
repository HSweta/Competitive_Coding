package Nagaroo_Question;



public class CountPali {

	public static void main(String[] args) {
		
	}
	
	public static void remove(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;}
		char last = ans.charAt(ans.length()-1);
		char first = ans.charAt(0);
		
		if(last==first) {
			remove(ques.substring(1),ans);
		}
		else {
			remove(ques.substring(1),ans+first);
		}
	}
}

