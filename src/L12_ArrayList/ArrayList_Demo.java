package L12_ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		int a=10;//privative datatype
		Integer x=100;//wrapper class,this is autoboxing as 100 is primitive 
		
		System.out.println(a);
		System.out.println(x);
		
		a=x; //unboxing
		System.out.println(a);
		
		x=a;//autoboxing
		System.out.println(x);

	}

}
