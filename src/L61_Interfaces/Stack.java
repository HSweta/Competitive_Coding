package L61_Interfaces;

public class Stack implements DSI {

	@Override
	public void push(int item) {

		System.out.println("in push");

	}

	@Override
	public int pop() {
		System.out.println("in pop");
		return 10;
	}

	@Override
	public int peek() {
		System.out.println("in pop");
		return 10;

	}
	
	public int size() {
		return 5;
	}

	
	public void display() {
		
		
	}

}
