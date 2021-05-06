package L5_Functions;

public class CharPyramid {
	
	public static void main (String args[]) {   
	         int n=6;
	        int row =1;
	        int nst=1;
	        while(row<=n){
	             int z=0;
	            if(row%2==1){

	                char result='a';
	                for(int cst=1;cst<=nst;cst++){
	                    System.out.print(result+" ");
	                    z=result+2;
	                     result= (char) (z);
	                }
	            }
	            else{
	                 char result='b';
	                for(int cst=1;cst<=nst;cst++){
	                    System.out.print(result+" ");
	                    z=result+2;
	                     result= (char) (z);
	                    
	            }
	            }
	            System.out.println();
	            row++;
	            nst++;
	        }
	    }
	}

