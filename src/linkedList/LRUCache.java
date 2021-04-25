package linkedList;

import java.util.HashMap;

public class LRUCache {

	int limit;
	int currLimit = 0;

	private HashMap<Integer, Node> map = new <Integer, DoubleLl>HashMap();

	public void insert(int data) {

		if (map.containsKey(data)) {
			DoubleLl.removeNode(map.get(data));
			currLimit--;

		}

		// insert into linked list
		if (currLimit >= limit) {
			// cache is full remove Least Recently used element
			DoubleLl.removeLRU();

			currLimit--;
		}
		Node dataNode = insertIntoDoubleLl(data);
		currLimit++;

		map.put(data, dataNode);

	}

	public void printCache() {
		Node node = DoubleLl.start;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	private Node insertIntoDoubleLl(int data) {
		Node d = new Node(data);
		return d;

	}

	public LRUCache(int limit) {
		this.limit = limit;
	}

}
