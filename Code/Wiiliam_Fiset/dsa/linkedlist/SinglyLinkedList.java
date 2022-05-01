package dsa.linkedlist;

import java.util.Collections;

@SuppressWarnings("hiding")
public class SinglyLinkedList<T> {

	private class Node {
		private T data;
		private Node next;
	}

	private Node head;
	private Node tail;
	private int len;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public SinglyLinkedList(T value) {
		Node n = new Node();
		n.data = value;
		n.next = null;
		this.head = n;
		this.tail = n;
		this.len++;
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	public void addAtHead(T val) {
		Node n = new Node();
		n.data = val;
		if (head == null) {
			// if list is empty then just add at head, and point head to null
			this.head = n;
			this.tail = n;
			this.head.next = null;
		} else {
			// if list is not empty then first connect new node to head and then make new
			// node the new head
			n.next = this.head;
			this.head = n;
		}
		this.len++;
	}

	public void addAtTail(T val) {
		Node n = new Node();
		n.data = val;
		if (head == null) {
			// if list is empty then just add at head, and point head to null
			this.head = n;
			this.tail = n;
			this.tail.next = null;
		} else {
			// if list is not empty
			// add new node to tail's next
			tail.next = n;
			// change new tail
			this.tail = n;
			// update tail's next to null
			tail.next = null;
		}
		this.len++;
	}

// 1 2 3 4 5 6
	// 7
	public void addAtndex(T val, int index) {
		Node n = new Node();
		n.data = val;
		if (index > 0 && index < len) {
			Node prev = head;
			for (int i = 1; i < index; i++) {
				prev = prev.next;
			}
			Node temp = prev.next;
			prev.next = n;
			n.next = temp;

		} else if (index == 0) {
			addAtHead(val);
		} else if (index == len) {
			addAtTail(val);
		} else {
			throw new IndexOutOfBoundsException();
		}
		this.len++;
	}

	public T removeFromHead() {
		if (this.isEmpty()) {
			// empty list
			throw new NullPointerException("LinkedList is already Empty");
		} else {
			T val = (T) head.data;
			// only one element in list
			if (head.next == null) {
				this.head = null;
				this.tail = null;
			} else {
				// more than one element in list
				this.head = head.next;
			}
			this.len--;
			return val;
		}
	}

	public T removeFromTail() {
		if (this.isEmpty()) {
			// empty list
			throw new NullPointerException("LinkedList is already Empty");
		} else {
			T val = (T) tail.data;
			// only one element in list
			if (head.next == null) {
				this.head = null;
				this.tail = null;
			} else {
				// more than one element in list
				Node curr = this.head;
				while (curr.next != tail) {
					curr = curr.next;
				}
				curr.next = null;
				this.tail = curr;
			}
			this.len--;
			return val;
		}
	}

	public T removeFromIndex(int index) {
		if (this.isEmpty()) {
			// empty list
			throw new NullPointerException("LinkedList is already Empty");
		} else {
			if (index == 0) {
				return removeFromHead();
			} else if (index == len - 1) {
				return removeFromTail();
			} else if (index > 0 && index < len - 1) {
				Node prev = this.head;
				Node curr = prev.next;
				for (int i = 1; i < index; i++) {
					prev = prev.next;
					curr = curr.next;
				}
				T val = (T) curr.data;
				prev.next = curr.next;
				curr.next = null;
				len--;
				return val;
			} else {
				throw new IndexOutOfBoundsException("Enter Valid Index Value");
			}
		}
	}

// 1 2 3 4 5 null
	@Override
	public String toString() {
		String str = "";
		Node n = head;
		while (n != null) {
			str += n.data + ",";
			n = n.next;
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return "SinglyLinkedList = [" + str;
	}

}
