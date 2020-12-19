package LinkedList;

public class intLinkedList {
	private class Node {
		private int value;
		private Node link;
	}

	private Node head;

//constructor()
	public intLinkedList(int item) {
		this.head = new Node();
		this.head.value = item;
		this.head.link = null;
	}

	// insert in start
	public boolean insertS(int item) {
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
	public boolean insertL(int item) {
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

	// display()
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.link;
		}
//		System.out.println(node.value);

	}

//insertAt()
	public void insertAt(int item, int idx) throws Exception {
		Node pre = head;
		if (idx < 0) {
			throw new IndexOutOfBoundsException();

		} 
		else if(idx==0){
			this.insertS(item);
		}
		else {
			for (int i = 0; i < idx - 1; i++) {
				if(pre==null) {//last node reached!!
					throw new IndexOutOfBoundsException();
				}
				pre = pre.link;
			}
			Node node = new Node();
			node.value = item;
			node.link = pre.link;// assigning current next node to node.link
			pre.link = node;// assigning node to previous node's link

		}
	}

	public boolean delete(int item) {
		Node temp = contains(item);
		if (temp != null) {// taking node

			if (temp == head) {// checking for head
				head = head.link;
			} else {
				Node start = head;
				while (start.link != temp) {// traversing till found node
					start = start.link;
				}

				start.link = temp.link;// previous node linked to next node

			}
			return true;
		} else {
			return false;
		}

	}

	public Node contains(int item) {
		Node start = head;
		while (start.value != item) {
			start = start.link;
			if (start == null) {

				break;
			}

		}
		if (start == null) {
			return null;
		} else {
			return start;
		}
	}

//implementing bubblesort
	public void bSort() {
		Node a = head;
		int c = 0;
		while (a.link != null) {
			Node b = head;
			while (b.link != null) {
				if (b.value > b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}

	}

	// swapping
//	private void swap(int a, int b) {
//		a = a + b;
//		b = a - b;// b=(a+b)-b==a;
//		a = a - b;// a=(a+b)-a=b;
//	}

}
