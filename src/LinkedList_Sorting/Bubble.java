package LinkedList_Sorting;

import java.util.LinkedList;

public class Bubble {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

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

	public void Bubble() {

		Node curr = head;

		Node index = null;

		while (curr != null) {

			index = curr.next;

			while (index != null) {

				if (index.data < curr.data) {
					int temp = index.data;
					index.data = curr.data;
					curr.data = temp;
				}

				index = index.next;
			}

			curr = curr.next;

		}

	}
	
	public void display() {
		
		Node current = head;
		
		if(head==null) {
			System.out.println("End");
		}
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		Bubble list = new Bubble();
		
		list.addNode(8);
		list.addNode(3);
		list.addNode(7);
		list.addNode(4);
		
		System.out.println("Originall list : ");
		list.display();
		
		list.Bubble();
		System.out.println("Sorted List : ");
		
		list.display();
		
		
	}

}
