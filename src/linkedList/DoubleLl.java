package linkedList;


public class DoubleLl {


	static Node start;
	static Node end;

	public DoubleLl(Node n) {
		
		if (start == null) {

			n.prev = null;
			start = n;
			end = n;
		} else {
			n.prev = end;
			end.next = n;
			end = n;

		}

	}

	public static void removeLRU() {
		Node temp = start.next;
		start = temp;

	}

	public static void removeNode(Node node) {

		// start
		if (node.prev == null && node.next != null) {
			node.next.prev = null;
			start = node.next;
		}
		// end
		else if (node.next == null && node.prev != null) {
			end = node.prev;
			node.prev = null;

		} else if (node == start && node.next == null)
			start = null;

		else {
			node.next.prev = node.prev;
			node.prev.next = node.next;
		}

	}

}
