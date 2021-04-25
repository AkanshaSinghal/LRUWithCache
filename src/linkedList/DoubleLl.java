package linkedList;


public class DoubleLl {

	int data;
	DoubleLl next;
	DoubleLl prev;

	static DoubleLl start;
	static DoubleLl end;

	public DoubleLl(int data2) {
		this.data = data2;
		this.next = null;
		if (start == null) {

			this.prev = null;
			start = this;
			end = this;
		} else {
			this.prev = end;
			end.next = this;
			end = this;

		}

	}

	public static void removeLRU() {
		DoubleLl temp = start.next;
		start = temp;

	}

	public static void removeNode(DoubleLl node) {

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
