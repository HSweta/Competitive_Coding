package L35_Queue;

public class QClient {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
	    q.enqueue(30);
	    q.enqueue(40);
         
	    q.display();
	    
	    q.dequeue();
	    q.dequeue();
	    
	    q.display();
	    
	    q.enqueue(80);
	    q.display();
	    
	}

}
