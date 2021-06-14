package Interface;

public class Stack implements DynamicStackI{

	@Override
	public void push(int item) {
		
		System.out.println(StackI.size);
	}

	@Override
	public int pop() {
		
		return 0;
	}

	@Override
	public void display() {
		
		
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

}
