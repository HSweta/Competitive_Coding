package GenericTreeDS;

public class GTClient {

	public static void main(String[] args) {
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt = new GenericTree();
	   //	gt.display();

		// System.out.println(gt.size());

//		System.out.println(gt.find(60));
//		System.out.println(gt.ht());

		// gt.mirror();
		// gt.display();
		// gt.printAtLevel(2);
//		gt.linearize();
//		gt.display();
		
		//gt.display1();
//		gt.preorder();
//		gt.postorder();
		
		//gt.levelOrder();
		//gt.levelOrderLinewise();
		gt.levelOrderZigZag();
		

	}

}
