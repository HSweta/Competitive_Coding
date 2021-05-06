package L5_Functions;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rot=sc.nextInt();
        
        //no of digits
        int nod = 0;
        int temp=n;// so that n value will be used later in below calculation
        while(temp!=0) {
        	nod=nod+1;
        	temp/=10;
        }
        
        rot = rot%nod;//if rot exceed the length of digits
        
        //rotate
        int divisor=(int) Math.pow(10, rot);//10^r
        
        int rem=n % divisor;//3456
        
        int quot = n/divisor; // 12
        
        int mult = (int) Math.pow(10, nod-rot);
        
        int ans=rem*mult+quot;
        
        System.out.println(ans);
        
        
        
	}

}
