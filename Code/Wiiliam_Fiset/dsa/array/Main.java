package dsa.array;

import dsa.linkedlist.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(2);
//		arr.add(23);
//		arr.add(3);
//		arr.add(4);
//		arr.add(32);
//		arr.add(12);
//		arr.add(20);
//		arr.add(239);
//		System.out.println(arr);
//		arr.removeAt(2);
//		System.out.println(arr);
//		arr.remove(new Integer(12));
//		System.out.println(arr);
//		System.out.println(arr.size());
//		System.out.println(arr.indexOf(23));
//		System.out.println(arr.contains(230));
//		System.out.println(arr.isEmpty());
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(12);
		list.addAtHead(21);
		list.addAtTail(23);
		System.out.println(list);
		list.addAtndex(34, 1);
		System.out.println(list);
		list.addAtHead(10);
		list.addAtHead(11);
		list.addAtHead(14);
		list.addAtHead(15);
		list.addAtHead(19);
		list.addAtHead(18);
		System.out.println(list);
		list.removeFromHead();
		System.out.println(list);
		list.removeFromTail();
		System.out.println(list);
		list.removeFromIndex(4);
		System.out.println(list);
//		System.out.println(list.size());
//		list.addAtAtndex(34, 10);
	}

}
