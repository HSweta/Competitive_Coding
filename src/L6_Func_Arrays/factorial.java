package L6_Func_Arrays;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)fact(5));
	}
	
	public static long fact(long n){
		long ans = 0;
		if(n==0)
		  return 1;

		ans=n*fact(n-1);

		return ans;	  
	}

}
