package L6_Func_Arrays;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PrintArmStrong(100, 1000);
	}
	
	public static void PrintArmStrong(int lo,int hi) {
		
		for(int n=lo;n<=hi;n++) {
			boolean res = isArmstrong(n);
			
			if(res==true)
				System.out.println(n);
		}
	}
	
	public static boolean isArmstrong(int n) {
		
		int check=0;
		int d = noOfDigits(n);
		int temp=n;
		
		while(temp>0) {
			
			int k = temp%10;
			
			check+=Math.pow(k, d);
            
			temp/=10;
		}
		
		if(check==n)
			return true;
		else
			return false;
					
	
	}
	
	public static int noOfDigits(int temp) {
		int c=0;
		while(temp>0) {
			temp/=10;
			c++;
		}
		return c;
	}

}
