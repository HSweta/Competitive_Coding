package L7_Arrays;


public class ArrayDemo {

	public static void main(String[] args) {
		
		//create
		int[] arr=null;
		System.out.println(arr);
		arr = new int[5];
		System.out.println(arr);
		
		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// set/update
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        
        //get
        System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//for loop
		System.out.println("-----FOR LOOP-----");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		//enhanced for loop
		System.out.println("-----EFL-----");
		for(int val:arr)
			System.out.println(val);
	
	    
	    
	    int[] arr1=arr; //no new array create it is a reference only
	   
	    System.out.println("-----Reference-----");
	    for (int i = 0; i < arr1.length; i++) {
	    	System.out.println(arr1[i]);
			
		}
	    
	    int[] other = new int[3];
	    other[0]=100;
	    other[1]=200;
	    other[2]=300;
	    
	    arr1 = other;
	    
	    //arr1=10;//wrong reference
	    
	    int[] one= {1,2,3,4};
	    int[] two= {5,7,8,9};
	    
	    System.out.println("-----case 1-----");
	    System.out.println(one[0]+" "+two[0]);
	    swap(one[0],two[0]);// does not work as int is passing not array
	    System.out.println(one[0]+" "+two[0]);
	    
	    //passing array 
	    System.out.println("-----case 2-----");
	    System.out.println(one[0]+" "+two[0]);
	    swap(one,two);
	    System.out.println(one[0]+" "+two[0]);
	    
	    //case3
	    System.out.println("-----case 3-----");
	    swap1(one,two);
	    for (int i : one) {
	    	System.out.print(i+" ");
			
		}
	    for (int i : two) {
	    	System.out.print(i+" ");
			
		}
	    
	}
	
	public static void swap(int a,int b) {
		int tem=a;
		    a=b; 
		    b=a;
		
	}

	public static void swap(int[] a,int[] b) {
		int tem=a[0];
		    a[0]=b[0];
		    b[0]=tem;
		
	}
	
	public static void swap1(int[] a,int[] b) {
		int tem[]=a;
		    a=b;
		    b=tem;
		
	}
	
	

}
