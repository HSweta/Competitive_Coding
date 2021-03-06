package L47_QPS;

public class MergeSortedLL {

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode h1, ListNode h2) {

		ListNode dn = new ListNode();
		ListNode tail = dn;

		while (h1 != null && h2 != null) {

			if (h1.val <= h2.val) {
				tail.next = h1;
				h1 = h1.next;
				tail = tail.next;
			}

			else {
				tail.next = h2;
				h2 = h2.next;
				tail = tail.next;
			}

		}

		if (h1 != null) {
			tail.next = h1;
		}
		if (h2 != null)
			tail.next = h2;

		return dn.next;

	}

	public static void main(String[] args) {

	}

}
