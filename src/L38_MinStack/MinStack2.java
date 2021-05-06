package L38_MinStack;

import java.util.Stack;

public class MinStack2 {
    
	Stack<Integer> s = new Stack<>();
	private int min;

	public void push(int val) throws Exception {

		if (s.isEmpty()) {
			s.push(val);
			min = val;
		}
		// no encryption
		else if (val >= min) {
			s.push(val);
		}
		// encryption
		else if (val < min) {
			push(2 * val - min);
		}
	}

	
	public int peek() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		// no encryption
		else if (s.peek() >= min) {
			return s.peek();
		}
		// encryption
		else { // if(super.peek() < min)
			return min;
		}

	}


	public int pop() throws Exception {

		if (s.isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		// no encryption
		else if (s.peek() >= min) {
			return s.pop();
		}
		// encryption
		else { // if(super.peek() < min)
			int ov = min;

			int topmostElement = s.pop();
			min = 2 * min - topmostElement;

			return ov;

		}

	}

	public int min() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		return min;
	}

}
