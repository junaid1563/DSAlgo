package LinkedList;

public class dLinkedList {
	private class Node {
		private int value;
		private Node prev;
		private Node next;
	}

	private Node head;

//constructor()
	public dLinkedList(int item) {
		this.head = new Node();
		this.head.value = item;
		this.head.next = null;
		this.head.prev = null;
	}

	// insert in start
	public boolean insertS(int item) {
		if (head != null) {
			Node node = new Node();
			node.value = item;
			node.next = head;
			head.prev = node;
			node.prev = null;
			head = node;// changing head
			return true;
		} else {
			this.head.value = item;
			this.head.next = null;
			this.head.prev = null;

			return true;
		}
	}

	// insert at last
	public boolean insertL(int item) {
		Node node = new Node();
		node.value = item;
		Node current = head;
		while (current.next != null) {// traversing till last node
			current = current.next;
		}
		node.prev = current;
		current.next = node;

		return true;

	}

	// display()
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
//		System.out.println(node.value);

	}

	public boolean delete(int item) {
		Node temp = contains(item);
		if (temp != null) {// taking node

			if (temp == head) {// checking for head
				head = head.next;
				head.prev = null;
			} else {
				Node start = head;
				while (start.next != temp) {// traversing till found node
					start = start.next;
				}
				Node last = temp.next;
				start.next = last;
				last.prev = start;
				return true;
			}
		}
		return false;
	}

	public Node contains(int item) {
		Node start = head;
		while (start.value != item) {
			start = start.next;
			if (start == null) {

				break;
			}

		}
		return start;
	}

////implementing bubblesort
//	public void bSort() {
//		Node a = head;
//		int c = 0;
//		while (a.link != null) {
//			Node b = head;
//			while (b.link != null) {
//				if (b.value > b.link.value) {
//					c = b.value;
//					b.value = b.link.value;
//					b.link.value = c;
//				}
//				b = b.link;
//			}
//			a = a.link;
//		}
//
//	}

	// swapping
//	private void swap(int a, int b) {
//		a = a + b;
//		b = a - b;// b=(a+b)-b==a;
//		a = a - b;// a=(a+b)-a=b;
//	}

}
