package L39_LinkedList;

public class ThreeSum {

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		Node() {

		}

	}

	private Node head;

	public boolean isEmpty() {
		return head == null;
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

	public void addLast(int item) throws Exception {

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

	public void display() {

		System.out.println("-------------------------");

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println("\n-------------------------");
	}

	private static Node mid(Node head) {

		if (head == null)
			return head;

		Node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node sortList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node slow = head;
		Node fast = head;
		Node tail = head;
		while (fast != null && fast.next != null) {
			tail = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		tail.next = null;

		Node left = sortList(head);
		Node right = sortList(slow);

		return merge(left, right);
	}

	public Node merge(Node left, Node right) {
		Node merged = new Node(0);
		Node current_node = merged;

		while (left != null && right != null) {
			if (left.data < right.data) {
				current_node.next = left;
				left = left.next;
			} else {
				current_node.next = right;
				right = right.next;
			}
			current_node = current_node.next;
		}
		if (left != null) {
			current_node.next = left;
		} else {
			current_node.next = right;
		}
		return merged.next;
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

	public static void main(String[] args) throws Exception {

		ThreeSum s = new ThreeSum();
		ThreeSum l1 = new ThreeSum();
		ThreeSum l2 = new ThreeSum();
		ThreeSum l3 = new ThreeSum();

		l1.addLast(30);
		l1.addLast(20);
		l1.addLast(10);
		l1.display();
		l1.head = l1.sortList(l1.head);
		l1.display();
		l1.reverse();
		l1.display();

	}

}
