package L36_Inheritance;

public class Client {
   
public static void main(String[] args) {
		
	//Case 1
	P obj1 = new P();
	System.out.println(obj1.d);
	System.out.println(obj1.d);
	obj1.fun();
	obj1.fun1();
	
	System.out.println();
	
	//Case 2
    P obj2 = new C();
    System.out.println(obj2.d); // 10
    System.out.println(obj2.d1); // 100
    System.out.println(((C)obj2).d2); // 200
    obj2.fun(); // C's fun
    ((C)obj2).fun(); // C's fun
    obj2.fun1();  // P's fun
    ((C)obj2).fun2(); //C's fun
    
    // Case 3 
//    C obj3 = new P(); //  not allowed
//    System.out.println(obj3.d);
//    System.out.println(obj3.d1); 
//    System.out.println(obj3.d2); 
    
    // Case 4
    C obj4 = new C();
    System.out.println(obj4.d); //20
    System.out.println(((C)obj4).d); //10
	System.out.println(obj4.d1);  //100
	System.out.println(obj4.d2);  //200
	obj4.fun(); // C's fun
	obj4.fun1();// P's fun1
	obj4.fun2();// C's fun2
		
	}

}
