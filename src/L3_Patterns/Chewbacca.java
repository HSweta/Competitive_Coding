package L3_Patterns;

public class Chewbacca {

	public static void main(String[] args) {
	  
		int n=5;
		
		for(int i=1;i<=n;i++){
			  if(i%2==1){
			  for(int j=1;j<=i;i++){
				  System.out.print(1);
			  }
			  }else{
				  for(int j=1;j<=i;i++){
					  if(j==1 || j==i)
				        System.out.print(1);
				      else{
						 System.out.print(0); 
					  }		
			  }
			  }
			  System.out.println();
		  }
	}

}
