package L60_AVL;

public class AVL {

	private class Node {

		int data;
		Node left;
		Node right;
		int ht;
	}

	private Node root;

	public void display() {
		System.out.println("---------------------");
		display(root);
		System.out.println("---------------------");
	}

	private void display(Node node) {

		if (node == null)
			return;

		String str = "";

		if (node.left != null)
			str += node.left.data;
		else
			str += ".";

		str += " -> " + node.data + " <- ";

		if (node.right != null)
			str += node.right.data;
		else
			str += ".";

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}
		return node.ht;
	}

	private int bf(Node node) {

		return ht(node.left) - ht(node.right);
	}

	public void add(int item) {
		add(root, item);
	}

	private Node add(Node node, int item) {

		if (node == null) {

			Node nn = new Node();
			nn.data = item;
			return nn;
		}

		if (item <= node.data) {
			node.left = add(node.left, item);
		} else {
			node.right = add(node.right, item);
		}

		// node ht update -> new node add below this present node
		node.ht = Math.max(ht(node.left), ht(node.right)) + 1;

		// balancing factor
		int bf = bf(node);

		// bf violate -> Rotation

		// LL case
		if (bf > 1 && item < node.left.data) {
			return rightRotation(node);
		}

		// RR case
		if (bf < -1 && item > node.right.data) {
			return leftRotation(node);
		}

		// LR
		if (bf > 1 && item > node.left.data) {
			node.left = leftRotation(node.left);
			return rightRotation(node);
		}

		// RL
		if (bf < -1 && item < node.right.data) {
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}

		return node;

	}

	private Node rightRotation(Node c) {

		// capture
		Node b = c.left;
		Node T3 = b.right;

		// link
		b.right = c;
		c.left = T3;

		// ht update
		c.ht = Math.max(ht(c.left), ht(c.right)) + 1;
		b.ht = Math.max(ht(b.left), ht(b.right)) + 1;

		return b;

	}

	private Node leftRotation(Node c) {

		// capture
		Node b = c.right;
		Node T2 = b.right;

		// link
		b.left = c;
		c.right = T2;

		// ht update
		c.ht = Math.max(ht(c.left), ht(c.right)) + 1;
		b.ht = Math.max(ht(b.left), ht(b.right)) + 1;

		return b;

	}

}
