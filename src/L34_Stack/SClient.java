package L34_Stack;

import java.util.ArrayList;

public class SClient {

	public static void main(String[] args) throws Exception{
		
		Stack s = new Stack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		//s.push(4);
		s.display();
		 
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		

	}

}
