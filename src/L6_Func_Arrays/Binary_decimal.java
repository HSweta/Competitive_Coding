package L6_Func_Arrays;

public class Binary_decimal {

	public static void main(String[] args) {
		int n=101010;
		Demica(n);
	}
	
	public static void Demica(int n){
        int i=0;
		int ans=0;
		while(n>0){
			int temp=n%10;
			ans+=Math.pow(2,i)*temp;
			n/=10;
			i++;
		}
		System.out.println(ans);
	}
}
