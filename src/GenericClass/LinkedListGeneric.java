package GenericClass;

public class LinkedListGeneric<T> {
	private class Node {

		T data;
		Node next;

		Node(T data) {
			this.data = data;
		}

		Node() {

		}

	}

	// starting point
	private Node head;

	public void display() {

		System.out.println("-------------------------");

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println("\n-------------------------");
	}

	public int size() {

		Node temp = head;

		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public T getFirst() throws Exception {

		if (isEmpty())
			throw new Exception("LL is Empty .");

		return head.data;
	}

	public T getLast() throws Exception {

		if (isEmpty())
			throw new Exception("LL is Empty .");

		Node temp = head;

		while (temp.next != null) {

			temp = temp.next;
		}

		return temp.data;

	}

	public T getAt(int idx) throws Exception {

		if (isEmpty())
			throw new Exception("LL is Empty .");

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {

		if (isEmpty())
			throw new Exception("LL is Empty .");

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addLast(T item) throws Exception {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (isEmpty()) {

			// your ll was already empty and now you are adding an element at fist
			head = nn;

		} else {

			// linking
			Node last = getNodeAt(size() - 1);
			last.next = nn;
		}

	}

	public void addFirst(T item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// linking
		nn.next = head;
		head = nn;

	}

	public void addAt(int idx, T item) throws Exception {

		if (idx < 0 || idx > size()) {
			throw new Exception("Invalid Index. ");
		}

		if (idx == 0)
			addFirst(item);

		else if (idx == size())
			addLast(item);

		else {

			// create new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// linking
			Node n1 = getNodeAt(idx - 1);
			Node n2 = getNodeAt(idx);

			n1.next = nn;
			nn.next = n2;

		}
	}

	public T removeLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty. ");
		}

		T rv = getLast();

		if (size() == 1) {
			head = null;
		} else {
			Node sm2 = getNodeAt(size() - 2);
			sm2.next = null;
		}

		return rv;
	}

	public T removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty. ");
		}

		T rv = getFirst();

		if (size() == 1) {
			head = null;
		} else {
			head = head.next;
		}

		return rv;
	}

	public T removeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty. ");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception(" Invalid Index. ");
		}

		if (idx == 0)
			return removeFirst();

		else if (idx == size() - 1)
			return removeLast();

		else {

			Node im1 = getNodeAt(idx - 1);
			Node i = im1.next;
			Node ip1 = i.next;

			im1.next = ip1;

			return i.data;
		}

	}

	public void reverse() {

		Node prev = head;
		Node curr = prev.next;

		while (curr != null) {

			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		head.next = null;
		head = prev;

	}

	private void reverseR(Node prev, Node curr) {

		if (curr == null) {
			head = prev;
			return;
		}
		reverseR(curr, curr.next);
		curr.next = prev;

	}

	public void reverseR() {
		reverseR(null, head);
	}

	private void reverseRD(Node prev, Node curr) {

		if (curr == null) {
			head = prev;
			return;
		}

		Node ahead = curr.next;

		curr.next = prev;

		reverseRD(curr, ahead);

	}

	private void reverseUsingOne(Node curr) {

		if (curr.next == null) {
			head = curr;
			return;
		}

		reverseUsingOne(curr.next);
		curr.next.next = curr;

	}

	public void reverseUsingOne() {

		Node temp = head;

		reverseUsingOne(head);

		temp.next = null;

	}

	public T mid() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public T KthFromLast(int k) {

		Node slow = head;
		Node fast = head;

		for (int i = 1; i <= k; i++) {
			fast = fast.next;

		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow.data;

	}

//	public void createDummyList() {
//
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
//		Node n9 = new Node(9);
//		Node n10 = new Node(10);
//		Node n11 = new Node(11);
//		Node n12 = new Node(12);
//		Node n13 = new Node(13);
//
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//		n8.next = n9;
//		n9.next = n10;
//
//		n13.next = n12;
//		n12.next = n11;
//		n11.next = n7;
//
//		intersection(n1, n13);
//
//	}

	public void intersection(Node h1, Node h2) {

		Node fp = h1;
		Node sp = h2;

		while (fp != sp) {

			if (fp == null)
				fp = h2;
			else
				fp = fp.next;

			if (sp == null)
				sp = h1;
			else
				sp = sp.next;
		}

		System.out.println(fp.data);

	}

	public void KReverse(int k) {
		head = KReverse(head, k);
	}

	private Node KReverse(Node node, int k) {

		if (node == null) {
			return null;
		}

		// to identify the argument of smaller problem
		Node temp = node;

		for (int i = 1; i <= k && temp != null; i++) {
			temp = temp.next;
		}

		// smaller problem : s2 and s3 reverse
		Node prev = KReverse(temp, k);

		// self work : reverse s1
		// reverse pointer iteratively
		Node curr = node;

		while (curr != temp) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		return prev;

	}
}
