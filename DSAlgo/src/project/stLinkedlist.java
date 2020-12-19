package project;

import LinkedList.person;

public class stLinkedlist {

	// Node Class
	private class Node {
		private students value;
		private Node link;
	}

	// head Node
	private Node head;

	public stLinkedlist(students item) {
		this.head = new Node();
		this.head.value = item;
		this.head.link = null;
	}

	// insert at last
	public boolean insert(students item) {// working
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

	public boolean contains(String roll_no) {// working
		Node start = head;
		if (start.value.getrollno().equals(roll_no)) {
			return true;
		} else {
			while (start != null) {

				if (start.value.getrollno().equals(roll_no)) {

					break;
				}
				start = start.link;

			}

			if (start == null) {
				return false;
			} else {
				return true;
			}
		}
	}

//getting a particular value
	public students getstudent(String roll_no) {
		Node start = head;
		if (head.value.getrollno().equals(roll_no)) {
			return head.value;
		} else {
			while (start != null) {
				if (start.value.getrollno().equals(roll_no)) {
					break;
				}
				start = start.link;
			}

		}
		if (start == null) {
			System.out.println("Not Found!!!!!!!!!!!");
			return null;
		} else {
			return start.value;
		}

	}

//delete function()
	public boolean delete(String roll_no) {//working
		Node start = head;
		Node next = head.link;
		if (head.value.getrollno().equals(roll_no)) {
			Node nexthead = head.link;
			head.link = null;
			head = nexthead;
		} else {
			while (next != null && !next.value.getrollno().equals(roll_no)) {
				start=next;
				next=next.link;

			}
			if(next!=null) {
				
				start.link=next.link;
				
				return true;
			}
			
		}
		
	return false;}

	// printAll()
	public void display() {// working
		Node node = head;
		if (node == null) {
			System.out.println("Empty List!!!");
		} else {
			while (node != null) {
				System.out.println(node.value.toString());
				node = node.link;
			}
		}
	}
}
