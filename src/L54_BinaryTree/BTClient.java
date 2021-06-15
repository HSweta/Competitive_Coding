package L54_BinaryTree;

public class BTClient {

	public static void main(String[] args) {
		// 10 true 20 true 40 false true 50 false false false true 30 false false
		// 10 true 20 true 50 false false true 60 false false true 30 false true 70
		// false false

		// bt.verticalTraversal();
//		bt.display();
//		System.out.println(bt.size());
//		System.out.println(bt.ht());
		// System.out.println(bt.find(60));
		// System.out.println(bt.max());
		// System.out.println(bt.leafNodesCount());
//		System.out.println(bt.diameter1());
//		System.out.println(bt.diameter2());
//		System.out.println(bt.diameter3());
////		
//		System.out.println(bt.isBalanced1());
//		System.out.println(bt.isBalanced2());
//		System.out.println(bt.isBalanced3());

		// 1 true 3 false true 6 false false true 2 true true 4 false false true 5 true
		// 8 false false true 7 false false
		// BinaryTree bt1 = new BinaryTree();

		// System.out.println(bt.flipEquivalent(bt1));
		// bt.preorder();
		// bt.preorder1();
		// System.out.println(bt.sum());

		// 10 true 20 true 40 true 2 false false true 3 false false true -60 false false
		// true 50 true 60 true 80 false false false true 70 false false true -100 false
		// false
//		System.out.println(bt.maxSubTreeSum3());
//		System.out.println(bt.maxSubTreeSum2());
//		System.out.println(bt.maxSubTreeSum1());

//		int[] pre = {10,20,40,50,30,70};
//		int[] in = {40,20,50,10,30,70};
//		
//		BinaryTree(pre, in);
//		bt.display();

		// 10 true 20 true 40 true 170 false false true 80 false false true 50 false
		// false true 30 true 60 true 90 false false true 100 false false true 70 false
		// false
		// 10 true 20 true 40 true 170 false false true 80 false false true 50 false
		// false true 30 true 60 true 90 false false true 100 false false true 70 false
		// false

//		int[] pre = {100,500,25,70,60,55,65,80,90,200,150,300};
//		int[] in = {25,500,55,60,65,70,80,90,100,150,200,300};

//		int[] pst = {9,15,7,20,3};
//		int[] in = {9,3,15,20,7};

		// BinaryTree b = new BinaryTree(pre,in);
		// b.display();
//		System.out.println(b.isTreeBST1());
//		System.out.println(b.isBST2());
//		System.out.println(b.isBST3());

		// System.out.println(b.largestBSTRootNode());
		// 3 true 9 false false true 20 true 15 false false true 7 false false

		BinaryTree b = new BinaryTree();
		b.zigzagLevelOrder();

		int[] pre = { 10, 20, 40, 60, 70, 30, 50 };
		int[] in = { 40, 20, 60, 10, 50, 60, 30 };
		
		

	}

}
