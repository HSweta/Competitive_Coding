package L13_TimeComplexity;

public class TimeCompDemo {
	
	public static void main(String[] args) {
		
		int n=10000;//o(1)
		
		for(int i=0;i<=n;i++) {//o(n)
			System.out.println(i);
		}
	}

}
