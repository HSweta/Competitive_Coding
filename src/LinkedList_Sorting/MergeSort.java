package LinkedList_Sorting;

import LinkedList_Sorting.Bubble.Node;

public class MergeSort {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}}

		Node head = null;
		Node tail = null;

		public void addNode(int data) {

			Node node = new Node(data);

			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = node;
			}

		}

		public Node middle(Node n) {
			Node fast = n;
			Node slow = n;

			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			return slow;
		}

		public Node Merge(Node l1, Node l2) {

			if (l1 == null)
				return l2;
			if (l2 == null)
				return l1;

			if (l1.data < l2.data) {
				return Merge(l1.next, l2);
			} else {
				return Merge(l1, l2.next);
			}
		}

		public Node Mergesort(Node h) {

			if (h == null || h.next == null)
				return h;

			Node mid = middle(h);

			Node Nmid = mid.next;

			mid.next = null;

			Node left = Mergesort(mid);

			Node right = Mergesort(Nmid);

			Node f = Merge(left, right);

			return f;
		}

	

	void printList(Node headref) {
		while (headref != null) {
			System.out.print(headref.data + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args) {

		MergeSort list = new MergeSort();
		
		list.addNode(4);
		list.addNode(1);
		list.addNode(18);
		list.addNode(8);
		
		list.printList(list.head);
		
		list.head = list.Mergesort(list.head);
		
		System.out.println("\nSorted List : \n");
		list.printList(list.head);
		
		
	}

}
