package L58_BST;

public class BSTClient {

	public static void main(String[] args) {
		
		
		int[] in = {};//{10,20,30,40,50,60,70};
		BST bst = new BST(in);
		//bst.display();
		//System.out.println(bst.find(50));
		//bst.replaceWithSumLarger();
		bst.add3(100);
		bst.add3(50);
		bst.add3(200);
		bst.add3(25);
		bst.add3(75);
		bst.add3(12);
		bst.add3(30);
		bst.add3(60);
		bst.add3(80);
		bst.add3(35);
		
		bst.remove(50);
		
		bst.display();
		
		
		

	}

}
