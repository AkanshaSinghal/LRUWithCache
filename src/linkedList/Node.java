package linkedList;

public class Node {


	int data;
	Node next;
	Node prev;
	
	public Node(int data2) {

		this.data = data2;
		this.next = null;
		DoubleLl d = new DoubleLl(this);
	}
}
