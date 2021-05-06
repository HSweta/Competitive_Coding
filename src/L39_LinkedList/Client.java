package L39_LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {

		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
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
		
		//System.out.println(ll.KthFromLast(2));
		
		ll.createDummyList();
		
		
		

	}

}
