package L6_Func_Arrays;

public class FunctionDemo {
	
    static int val = 10;	

	public static void main(String[] args) {
		
		System.out.println("Hii main");
		
		System.out.println("-----case 1------");
		//call
		addition();
        subtraction();
        
        System.out.println("-----case 2 -----");
        
        int a=100;
        int b=200;
        
        additionParams(a, b);
        
        System.out.println("-----case 3 -----");
        
        int x = additionReturn(25, 30);
        
        System.out.println(x);
        
        System.out.println("-----case 4 -----");
        
        System.out.println(val);//10
        
        int val = 100;
        
        System.out.println(val); // 100
        
        System.out.println(FunctionDemo.val);//for printing global variable 
        
        fun(val);
        
        System.out.println(val);
        
        System.out.println(FunctionDemo.val);
        
		
		System.out.println("-----case 5------");
		
		int one = 20;
		int another = 30;
		
		System.out.println(one+" "+another);
		
		swap(one, another);
		
		System.out.println(one+" "+another);
		
		System.out.println("Bye main!!!");
		
		fun(one);
		System.out.println(FunctionDemo.val);
	}
	
	public static void swap(int one ,int two) {
		
		System.out.println(one+" "+two);
		
		int temp = one;
		one = two;
		two = temp;
		
		System.out.println(one+" "+two);
		
	}
	public static int additionReturn(int a,int b) {
		
		int sum=a+b;
		
		return sum;
	}
	
	public static void additionParams(int a,int b) {
		
		int sum = a + b;
		
		a=a+10;
		
		System.out.println(sum);
	
	}

    public static void addition() {
    	
    	 int a=10;
    	 int b=20;
    	 
    	 int sum=a+b;
         
    	 subtraction();
    	 
    	 System.out.println(sum);
    	 
    }
    
    public static void subtraction() {
   	 int a=100;
   	 int b=60;
   	 
   	 int diff=a-b;
  
   	 System.out.println(diff);
   	 
   }
    
    public static void fun(int a) {
    	
    	int val= 20;
    	
    	FunctionDemo.val = val +30; // functiondemo=50
    	
    	System.out.println(val);//50
    	
    	System.out.println(FunctionDemo.val);//50
    }
}
