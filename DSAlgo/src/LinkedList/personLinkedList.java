package LinkedList;

public class personLinkedList {
	// Node Class
	private class Node {
		private person value;
		private Node link;
	}

//head Node
	private Node head;

//constructor()
	public personLinkedList(person item) {
		this.head = new Node();
		this.head.value = item;
		this.head.link = null;
	}

	// insert in start
	public boolean insertS(person item) {
		Node node = new Node();
		node.value = item;
		if (head != null) {

			node.link = head;
			head = node;// changing head
			return true;
		} else {
			head = node;
			node.link = null;
			return true;
		}
	}

	// insert at last
	public boolean insertL(person item) {
		Node node = new Node();
		node.value = item;
		Node current = head;
		while (current.link != null) {// traversing till last node
			current = current.link;
		}

		current.link = node;
		node.link = null;
		return true;

	}

	// insertAt()
	public void insertAt(person item, int idx) {
		Node pre = head;
		for (int i = 0; i < idx - 1; i++) {
			pre = pre.link;
		}
		Node node = new Node();
		node.value = item;
		node.link = pre.link;// assigning current next node to node.link
		pre.link = node;// assigning node to previous node's link

	}

	// display()
	public void display() {
		Node node = head;
		if (node == null) {
			System.out.println("Empty List!!!");
		} else {
			while (node != null) {
				System.out.println(node.value.toString());
				node = node.link;
			}
//			System.out.println(node.value.toString());
		}
	}


	public boolean delete(String name) {
		Node temp = contains(name);
		if (temp != null) {// taking node

			if (temp == head) {// checking for head
				head = head.link;
			} else {
				Node start = head;
				while (start.link != temp) {// traversing till found node
					start = start.link;
				}

				start.link = temp.link;
				return true;
			}
		}
		return false;
	}

	public Node contains(String name) {
		Node start = head;
		if (start.value.getName().equals(name)) {
			return start;
		} else {
			while (!start.value.getName().equals(name)) {
				start = start.link;
				if (start == null) {

					break;
				}

			}

			return start;
		}
	}
//implementing bubblesort
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
