package Question_Session;

public class Assignment {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String g = "GeKf@rGeek$";
//		System.out.println(g.toCharArray());
//		char s = 'a';
//		s++;
//		System.out.println(s);

		int[][] arr = {
	            { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
	            { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
	            { 17, 18, 19, 20 },
	        };
		diagonal(arr);
	}
	
	public static String toggle(char[] str) {
		
		for (int i = 0; i <str.length; i++) {
			
			if(str[i]>='A' && str[i]<='Z') {
				str[i]=(char)(str[i]+'a'-'A');
				
			}else if(str[i]>='a' && str[i]<='z') {
				str[i]=(char)(str[i]+'a'-'A');
			}
			
		}
		String ans=String.valueOf(str);  
		return ans; 
		
	}
	public static void diagonal(int[][] arr) {
		boolean a = false;
		for(int i=0;i<2*arr.length-1;i++) {
			int j=0;
			int k = i;
			if(a) {
				k=arr.length-1;
				j=1;
			}
			while(j<arr[1].length && k>=0) {
				System.out.print(arr[k][j]+" ");
				k=k-1;
				j=j+1;
				
			}
			j=0;
			System.out.println();
			if(k==0 && j==arr[1].length-1) {
				
				a=true;
				
			}
		}
	}

}
