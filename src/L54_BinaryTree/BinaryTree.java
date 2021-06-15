package L54_BinaryTree;

import java.util.*;

public class BinaryTree {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		root = construct(null, true);
	}

	// ilc -> true : parent left child create
	// ilc -> false : parent right child create

	private Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.print("Enter the data for root node ?");
		} else {
			if (ilc)
				System.out.println("Enter the data for left child of " + parent.data + " ?");
			else
				System.out.println("Enter the data for right child of " + parent.data + " ?");
		}

		int item = sc.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println(nn.data + " has left child ?");
		boolean hlc = sc.nextBoolean();

		if (hlc)
			nn.left = construct(nn, true);

		System.out.println(nn.data + " has right child ?");
		boolean hrc = sc.nextBoolean();

		if (hrc)
			nn.right = construct(nn, false);

		return nn;
	}

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

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		if (node == null)
			return 0;

		int count = 0;

		count += size(node.left);
		count += size(node.right);

		return count + 1;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		if (node == null)
			return -1;

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null)
			return false;

		if (node.data == item)
			return true;

		boolean lf = find(node.left, item);

		boolean rf = find(node.right, item);

		return (lf || rf);
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node == null)
			return Integer.MIN_VALUE;

		int max = node.data;

		max = Math.max(max, max(node.left));
		max = Math.max(max, max(node.right));

		return max;

	}

	public int leafNodesCount() {
		return leafNodesCount(root);
	}

	private int leafNodesCount(Node node) {

		if (node == null)
			return 0;

		if (node.left == null && node.right == null)
			return 1;

		int llc = leafNodesCount(node.left);
		int rlc = leafNodesCount(node.right);

		return llc + rlc;
	}

	private int diameter;

	public int diameter1() {
		diameter1(root);
		return diameter;
	}

	private void diameter1(Node node) {

		if (node == null)
			return;

		diameter1(node.left);
		diameter1(node.right);

		int pnDiameterRootNode = ht(node.left) + ht(node.right) + 2;

		if (pnDiameterRootNode > diameter)
			diameter = pnDiameterRootNode;
	}

	public int diameter2() {
		return diameter2(root);

	}

	private int diameter2(Node node) {

		if (node == null)
			return 0;

		int ld = diameter2(node.left);
		int rd = diameter2(node.right);

		int sd = ht(node.left) + ht(node.right) + 2;

		return Math.max(sd, Math.max(ld, rd));
	}

	private class DiaPair {
		int dia = 0;
		int ht = -1;
	}

	public int diameter3() {
		return diameter3(root).dia;
	}

	private DiaPair diameter3(Node node) {

		if (node == null)
			return new DiaPair();

		DiaPair ldp = diameter3(node.left);
		DiaPair rdp = diameter3(node.right);

		DiaPair sdp = new DiaPair();

		int ld = ldp.dia;
		int rd = rdp.dia;

		int sd = ldp.ht + rdp.ht + 2;

		sdp.dia = Math.max(sd, Math.max(ld, rd));
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		return sdp;

	}

	private boolean isBal = true;

	public boolean isBalanced1() {
		isBalanced1(root);
		return isBal;
	}

	private void isBalanced1(Node node) {

		if (node == null)
			return;

		isBalanced1(node.left);
		isBalanced1(node.right);

		int bf = ht(node.left) - ht(node.right);

		if (bf <= -2 || bf >= 2) {
			isBal = false;
			return;
		}

	}

	public boolean isBalanced2() {
		return isBalanced2(root);

	}

	private boolean isBalanced2(Node node) {

		if (node == null)
			return true;

		boolean lb = isBalanced2(node.left);
		boolean rb = isBalanced2(node.right);

		int bf = ht(node.left) - ht(node.right);

		if (lb && rb && (bf == 1 || bf == 0 || bf == -1))
			return true;
		else
			return false;

	}

	private class BalPair {
		boolean bal = true;
		int ht = -1;
	}

	public boolean isBalanced3() {
		return isBalanced3(root).bal;

	}

	private BalPair isBalanced3(Node node) {

		if (node == null)
			return new BalPair();

		BalPair lbp = isBalanced3(node.left);
		BalPair rbp = isBalanced3(node.right);

		BalPair sbp = new BalPair();

		// sbp bal

		boolean lb = lbp.bal;
		boolean rb = lbp.bal;

		int bf = lbp.ht - rbp.ht;

		if (lb && rb && (bf == 1 || bf == 0 || bf == -1))
			sbp.bal = true;
		else
			sbp.bal = false;

		// sbp ht
		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;

		return sbp;

	}

	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(this.root, other.root);

	}

	private boolean flipEquivalent(Node n1, Node n2) {

		if (n1 == null && n2 == null)
			return true;

		if (n1 == null || n2 == null)
			return false;

		if (n1.data != n2.data)
			return false;

		boolean flip = flipEquivalent(n1.left, n2.right) && flipEquivalent(n1.right, n2.left);
		boolean noflip = flipEquivalent(n1.left, n2.left) && flipEquivalent(n1.right, n2.right);

		return flip || noflip;
	}

	public void display2() {
		display2(root);
	}

	private void display2(Node node) {

		if (node == null)
			return;

		System.out.println("hii " + node.data);

		display2(node.left);
		System.out.println("Coming back from lc and going towards ec of " + node.data);
		display2(node.right);

		System.out.println("bye " + node.data);

	}

	// NLR : Preorder
	// LRN : PostOrder
	// LNR : Inorder
	// NRL : rev postorder
	//

	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node node) {

		if (node == null)
			return;

		System.out.println(node.data + " ");

		preorder(node.left);
		preorder(node.right);

	}

	private class Pair {
		Node n;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preorder1() {

		// create a stack
		Stack<Pair> s = new Stack<>();

		// make a pair with root node
		Pair sp = new Pair();

		sp.n = root;
		s.push(sp);

		while (!s.isEmpty()) {

			Pair tp = s.peek();

			if (tp.sd == false) {
				System.out.print(tp.n.data + " ");
				tp.sd = true;
			}

			else if (tp.ld == false) {

				Pair np = new Pair();
				np.n = tp.n.left;

				if (np.n != null)
					s.push(np);

				tp.ld = true;

			} else if (tp.rd == false) {

				Pair np = new Pair();
				np.n = tp.n.right;

				if (np.n != null)
					s.push(np);

				tp.rd = true;

			} else {

				s.pop();
			}
		}

	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node node) {

		if (node == null)
			return 0;

		int l = sum(node.left);
		int r = sum(node.right);

		return l + r + node.data;
	}

	static int mss = Integer.MIN_VALUE;

	public int maxSubTreeSum1() {
		maxSubTreeSum1(root);
		return mss;
	}

	private void maxSubTreeSum1(Node node) {

		if (node == null)
			return;

		maxSubTreeSum1(node.left);
		maxSubTreeSum1(node.right);

		int pntreesum = sum(node.left) + sum(node.right) + node.data;

		if (mss < pntreesum)
			mss = pntreesum;

	}

	public int maxSubTreeSum2() {
		return maxSubTreeSum2(root);

	}

	private int maxSubTreeSum2(Node node) {

		if (node == null)
			return 0;

		int ls = maxSubTreeSum2(node.left);
		int rs = maxSubTreeSum2(node.right);

		int pntreesum = sum(node.left) + sum(node.right) + node.data;

		return Math.max(pntreesum, Math.max(ls, rs));

	}

	private class MSSPair {
		int mss = Integer.MIN_VALUE;;
		int es = 0;
	}

	public int maxSubTreeSum3() {
		return maxSubTreeSum3(root).mss;

	}

	private MSSPair maxSubTreeSum3(Node node) {

		if (node == null)
			return new MSSPair();

		MSSPair lmssp = maxSubTreeSum3(node.left);
		MSSPair rmssp = maxSubTreeSum3(node.right);

		MSSPair smssp = new MSSPair();

		// mss
		smssp.mss = Math.max(lmssp.es + rmssp.es + node.data, Math.max(lmssp.mss, rmssp.mss));

		// es
		smssp.es = lmssp.es + rmssp.es + node.data;

		return smssp;

	}

	private class VOPair {
		Node n;
		int vl;

		VOPair(Node n, int vl) {
			this.n = n;
			this.vl = vl;
		}
	}

	public void verticalTraversal() {

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		Queue<VOPair> q = new LinkedList<>();

		VOPair sp = new VOPair(root, 0);
		q.add(sp);

		while (!q.isEmpty()) {

			// remove
			VOPair rp = q.remove();

			// check if entry is already present with rp.vl ? if no ,then make an entry
			if (!map.containsKey(rp.vl))
				map.put(rp.vl, new ArrayList<>());

			// add the data of node in map
			map.get(rp.vl).add(rp.n.data);

			// left child
			if (rp.n.left != null) {
				VOPair left = new VOPair(rp.n.left, rp.vl - 1);
				q.add(left);
			}

			// right child
			if (rp.n.right != null) {
				VOPair right = new VOPair(rp.n.right, rp.vl + 1);
				q.add(right);
			}
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);

		for (int key : keys) {
			System.out.println(key + " -> " + map.get(key));
		}
	}

//	private void verticalOrder(Node node) {
//
//	}

	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi)
			return null;

		Node nn = new Node();
		nn.data = pre[plo];

		int nel = 0;
		int si = -1;

		for (int i = ilo; i <= ihi; i++) {

			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
			nel++;
		}

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}

	private Node construct1(int[] pst, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi)
			return null;

		Node nn = new Node();
		nn.data = pst[phi];

		int nel = 0;
		int si = -1;

		for (int i = ilo; i <= ihi; i++) {

			if (in[i] == pst[phi]) {
				si = i;
				break;
			}
			nel++;
		}

		nn.left = construct1(pst, plo, plo + nel - 1, in, ilo, si - 1);
		nn.right = construct1(pst, plo + nel, phi - 1, in, si + 1, ihi);

		return nn;
	}

	private int min(Node node) {
		if (node == null)
			return Integer.MAX_VALUE;

		int max = node.data;

		max = Math.min(max, min(node.left));
		max = Math.min(max, min(node.right));

		return max;
	}

	private boolean isBST1 = true;

	public boolean isTreeBST1() {
		isTreeBST1(root);
		return isBal;
	}

	void isTreeBST1(Node node) {
		if (node == null)
			return;

		isTreeBST1(node.left);
		isTreeBST1(node.right);

		int leftMax = max(node.left);
		int rightMin = min(node.right);

		if (!(node.data >= leftMax && node.data <= rightMin)) {
			isBST1 = false;
		}

	}

	public boolean isBST2() {
		return isBST2(root);
	}

	private boolean isBST2(Node node) {

		if (node == null)
			return true;

		boolean lbst = isBST2(node.left);
		boolean rbst = isBST2(node.right);

		int leftMax = max(node.left);
		int rightMin = min(node.right);

		if (lbst && rbst && (node.data > leftMax && node.data < rightMin))
			return true;
		else
			return false;

	}

	private class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public boolean isBST3() {
		return isBST3(root).isBST;
	}

	private BSTPair isBST3(Node node) {

		if (node == null)
			return new BSTPair();

		BSTPair lp = isBST3(node.left);
		BSTPair rp = isBST3(node.right);

		BSTPair sp = new BSTPair();

		int leftMax = lp.max;
		int rightMin = rp.min;

		if (lp.isBST && rp.isBST && (node.data > leftMax && node.data < rightMin)) {
			sp.isBST = true;

		} else {
			sp.isBST = false;
		}

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		return sp;

	}

	private class LBSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int largestBSTRootNode;
		int size = 0;
	}

	public int largestBSTRootNode() {
		return largestBST(root).largestBSTRootNode;
	}

	private LBSTPair largestBST(Node node) {

		if (node == null)
			return new LBSTPair();

		LBSTPair lp = largestBST(node.left);
		LBSTPair rp = largestBST(node.right);

		LBSTPair sp = new LBSTPair();

		int leftMax = lp.max;
		int rightMin = rp.min;

		if (lp.isBST && rp.isBST && (node.data > leftMax && node.data < rightMin)) {
			sp.isBST = true;

		} else {
			sp.isBST = false;
		}

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		// largestBST
		if (sp.isBST) {
			sp.largestBSTRootNode = node.data;
			sp.size = lp.size + rp.size + 1;
		} else {

			if (lp.size >= rp.size) {
				sp.largestBSTRootNode = lp.largestBSTRootNode;
				sp.size = lp.size;
			} else {
				sp.largestBSTRootNode = rp.largestBSTRootNode;
				sp.size = rp.size;
			}
		}

		return sp;

	}

	public void LevelOrderPrint() {
		List<List<Integer>> ans = levelOrder(root);
		System.out.println(ans);

	}

	List<List<Integer>> ans = new ArrayList<>();

	private List<List<Integer>> levelOrder(Node root) {

		// List<List<Integer>> ans = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		Queue<Node> h = new LinkedList<>();

		q.add(root);
		ArrayList<Integer> a1 = new ArrayList<>();
		while (!q.isEmpty()) {

			Node rn = q.remove();
			// System.out.println(rn.data);

			if (rn == null)
				break;

			a1.add(rn.data);

			if (rn.left != null)
				h.add(rn.left);

			if (rn.right != null)
				h.add(rn.right);

			if (q.isEmpty()) {
				ans.add(new ArrayList<>(a1));
				System.out.println(a1);
				System.out.println(ans);
				a1.removeAll(a1);

				Queue<Node> temp = q;
				q = h;
				h = temp;
			}

		}

		return ans;

	}

	public void zigzagLevelOrder() {
		List<List<Integer>> ans = zigzagLevelOrder(root);
		System.out.println(ans);

	}

	public List<List<Integer>> zigzagLevelOrder(Node root) {
		List<List<Integer>> ans = new ArrayList<>();

		Stack<Node> s = new Stack<>();
		Stack<Node> h = new Stack<>();

		s.add(root);
		int count = 0;
		ArrayList<Integer> a1 = new ArrayList<>();
		while (!s.isEmpty()) {
			Node rs = s.pop();

			if (rs == null)
				break;

			a1.add(rs.data);

			if (count % 2 == 0) {
				if (rs.left != null) {
					h.push(rs.left);
				}
				if (rs.right != null) {
					h.push(rs.right);
					System.out.println(rs.right.data);
				}
			} else {
				if (rs.right != null) {
					h.push(rs.right);
					System.out.println(rs.right.data);
				}
				if (rs.left != null) {
					h.push(rs.left);
					System.out.println(rs.left.data);
				}
			}

			if (s.isEmpty()) {
				ans.add(new ArrayList<>(a1));
				a1.clear();

				Stack<Node> temp = s;
				s = h;
				h = temp;
				count++;
			}

		}

		return ans;
	}

	private class VOPair2 implements Comparable<VOPair2> {
		int data;
		int hl;

		@Override
		public String toString() {
			return data + " -> " + hl;
		}

		@Override
		public int compareTo(VOPair2 o) {
			if (this.hl - o.hl == 0) {
				return this.data - o.data;
			} else {
				return this.hl - o.hl;
			}

		}
	}
		public List<List<Integer>> verticalTraversal2() {

			List<List<Integer>> ans = new ArrayList<>();

			HashMap<Integer, ArrayList<VOPair2>> map = new HashMap<>();
			verticalTraversal2(root, 0, 0, map);

			ArrayList<Integer> keys = new ArrayList<>(map.keySet());
			Collections.sort(keys);

			for (int key : keys) {
				ArrayList<VOPair2> temp = map.get(key);
				Collections.sort(temp);

				List<Integer> tempdata = new ArrayList<>();
				for (VOPair2 pair : temp) {
					tempdata.add(pair.data);
				}

				ans.add(tempdata);

				// System.out.println(key+" -> "+temp);

			}

			return ans;

		}

		private void verticalTraversal2(Node node, int vl, int hl, HashMap<Integer, ArrayList<VOPair2>> map) {

			if (!map.containsKey(vl)) {
				map.put(vl, new ArrayList<>());
			}

			VOPair2 np = new VOPair2();
			np.data = node.data;
			np.hl = hl;
			map.get(vl).add(np);

			verticalTraversal2(node.left, vl - 1, hl + 1, map);
			verticalTraversal2(node.right, vl + 1, hl + 1, map);
		}
}
