package L15_String;

import java.util.Scanner;

import L7_Arrays.ArraysOps;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
	String str = sc.next();
//		//printChars(str);
//		printSubstring(str);
//	
		System.out.println(countPalidromesubString1(str));
		}
	
	public static void printChars(String str) {
		
		for(int i = 0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++)
				System.out.println(str.substring(i,j));
		}
		
		
	}

    public static boolean Palidrome(String str) {
    	
    	int i=0;
    	int j=str.length()-1;
    	boolean ans=true;
    	while(i<=j) {
    		if(str.charAt(i)==str.charAt(j)) {
    			i++;
    			j--;
    		}
    		else {
    			ans=false;
    			break;
    		}
    		 			
    	}
    	return ans;
    }
    
  public static boolean Palidrome1(String str) {
    	
    	int i=0;
    	int j=str.length()-1;
    	boolean ans=true;
    	while(i<j) {
    		if(!(str.charAt(i)==str.charAt(j)))
    			return false;
    		i++;
    		j--;
    		 			
    	}
    	return ans;
    }

  public static int countPalidromesubString(String str) {
    	int count=0;
    	String str1;
    	for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				str1= str.substring(i,j);
				if(Palidrome(str1))
					count+=1;
			}
		}
	return count;	
    }
   
    public static int countPalidromesubString1(String str) {
    	
    	int count=0;
    	//count odd length palidromic substrings
    	for(int axis=0;axis<str.length();axis++) {
    		
    		for (int orbit = 0; axis -orbit>=0 && axis + orbit<str.length(); orbit++) {
				 
    			if(str.charAt(axis -orbit)==str.charAt(axis+orbit)) {
					count++; 
					//System.out.println(orbit*2+1);  length of maximum palidromic substrings	
    			}
    			else
    				break;
    		
			    }
    		
			}
    	
    	//count even length palidromic substrings
    	for(double axis=0.5;axis<str.length();axis++) {//n
    		
    		for (double orbit = 0.5; axis -orbit>=0 && axis + orbit<str.length(); orbit++) {
				 //n/2
    			if(str.charAt((int)(axis -orbit))==str.charAt((int)(axis+orbit))) {
					count++; 
					//System.out.println(orbit*2);  length of maximum palidromic substrings
					}
    			else
    				break;
    		
			    }
    		
			}
		
	return count;	
    }
    
}
