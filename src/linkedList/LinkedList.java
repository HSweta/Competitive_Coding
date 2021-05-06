package linkedList;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		System.out.println("------------------");

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}

		System.out.println(".");
		System.out.println("------------------");
	}

	public int getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return head.data;
	}

	public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return tail.data;
	}

	public int getAtindex(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (idx < 0 || idx <= this.size) {
			throw new Exception("invalid index");
		}

		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");
		}

		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addLast(int item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size >= 1) {
			this.tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(int item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size >= 1) {
			nn.next = head;
		}

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public void addAt(int item, int idx) throws Exception {

		if (idx > size || idx < 0) {
			throw new Exception("invalid index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nm1 = getNodeAt(idx - 1);
			Node nm2 = nm1.next;

			nm1.next = nn;
			nn.next = nm2;

			this.size++;

		}

	}

//	public int removeFirst() throws Exception {
//
//		if (this.size == 0) {
//			throw new Exception("LL is Empty");
//		}
//		
//		int rv = this.head.data;
//
//		if (this.size == 1) {
//			this.head = null;
//			this.tail = null;
//			this.size = 0;
//		} else {
//			this.head = this.head.next;
//			this.size--;
//		}
//
//		return rv;
//	}
	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return rv;

	}

	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");

		}

		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = getNodeAt(this.size - 2);
			this.tail = sizem2;
			this.tail.next = null;
			this.size--;
		}

		return rv;

	}

	public int removeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (idx >= this.size || idx < 0) {
			throw new Exception("Invalid index");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {

			Node nn1 = getNodeAt(idx - 1);
			Node nn2 = nn1.next;
			Node n = nn2.next;

			nn1.next = nn2;
			this.size--;

			return nn2.data;
		}
	}

	public void reverseData() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;

		}
	}

	public void reversePointer() throws Exception {

		Node prev = this.head;
		Node curr = this.head.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}

		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		tail.next = null;

	}

	public int mid() {

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}
}
