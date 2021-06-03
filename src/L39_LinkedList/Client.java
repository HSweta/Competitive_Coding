package L39_LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {

		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.addLast(80);
		ll.addLast(90);
		ll.display();

//		ll.reverseR();
//		ll.display();

//		ll.addLast(50);
//		ll.display();
//		
//		ll.addAt(2,60);
//		ll.display();
//		
//		System.out.println(ll.removeAt(4));
//		ll.addFirst(1);
//		ll.display();

		// System.out.println(ll.KthFromLast(2));

		// ll.createDummyList();
		ll.KReverse(3);
		ll.display();

	}

}
