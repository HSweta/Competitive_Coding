//package L61_Generics.Class;
//
//
//public class HashMapGeneric<K,V> {
//
//	private class Node {
//		K key;
//		V value;
//		Node next;
//
//		public Node(K key, V value) {
//			this.key = key;
//			this.value = value;
//			this.next = null;
//		}
//	}
//
//	private Node[] bucketArray;
//	int size;
//
//	public HashMapGeneric() {
//		this(4);
//	}
//
//	public HashMapGeneric(int capacity) {
//
//		bucketArray = new Node[capacity];
//		size = 0;
//	}
//
//	private int hashFunction(String key) {
//
//		int hc = key.hashCode();
//		int bn = hc % bucketArray.length;
//
//		return bn;
//	}
//
//	public void put(String key, Integer value) {
//
//		int bn = hashFunction(key);
//
//		Node temp = bucketArray[bn];
//
//		while (temp != null) {
//
//			if (temp.key.equals(key)) {
//				temp.value = value;
//				return;
//			}
//
//			temp = temp.next;
//		}
//
//		// code flow
//
//		Node nn = new Node(key, value);
//
//		Node head = bucketArray[bn];
//
//		nn.next = head;
//		bucketArray[bn] = nn;
//
//		head = nn;
//
//		size++;
//
//		// load factor
//		double lf = (1.0 * size) / bucketArray.length;
//		int threshold = 2;
//
//		if (lf > threshold) {
//			rehash();
//		}
//	}
//
//	private void rehash() {
//
//		Node[] oba = bucketArray;
//		Node[] nba = new Node[bucketArray.length * 2];
//
//		bucketArray = nba;
//		size = 0;
//
//		for (Node temp : oba) {
//
//			while (temp != null) {
//
//				put(temp.key, temp.value);
//				temp = temp.next;
//			}
//		}
//
//	}
//
//	public Integer get(String key) {
//
//		int bn = hashFunction(key);
//
//		Node temp = bucketArray[bn];
//
//		while (temp != null) {
//
//			if (temp.key.equals(key)) {
//				return temp.value;
//			}
//
//			temp = temp.next;
//		}
//
//		return null;
//	}
//
//	public boolean ContainsKey(String key) {
//
//		int bn = hashFunction(key);
//
//		Node temp = bucketArray[bn];
//
//		while (temp != null) {
//
//			if (temp.key.equals(key)) {
//				return true;
//			}
//
//			temp = temp.next;
//		}
//
//		return false;
//	}
//
//	public Integer remove(String key) {
//
//		int bn = hashFunction(key);
//
//		Node temp = bucketArray[bn];
//
//		Node prev = null;
//
//		while (temp != null) {
//
//			if (temp.key.equals(key)) {
//				break;
//
//			}
//
//			prev = temp;
//
//			temp = temp.next;
//		}
//
//		// key was not present
//		if (temp == null)
//			return null;
//
//		// if we are outside of loop because of break
//		if (prev == null) {
//			bucketArray[bn] = temp.next;
//		} else {
//			prev.next = temp.next;
//
//		}
//
//		size--;
//
//		return temp.value;
//	}
//
//	@Override
//	public String toString() {
//
//		String str = "";
//
//		for (Node temp : bucketArray) {
//
//			while (temp != null) {
//
//				str += temp.key + "=" + temp.value + " ";
//				temp = temp.next;
//			}
//
//		}
//
//		return str;
//	}
//}
