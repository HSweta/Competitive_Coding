package Question_Session;

public class Kartik_Bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String str="aababbbb";
		
	}
	
	public static int Kartik_Bhaiya_And_String(String str,int k,char c) {
		
		int ans=0;
		int i=0;
		int j=0;
		int count=0;
		while(j<str.length()) {
			
			if(str.charAt(j)==c) {
				count++;
			}
			while(count>k) {
				if(str.charAt(i)==c) {
					count--;
				}
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans;
				
	}

}
