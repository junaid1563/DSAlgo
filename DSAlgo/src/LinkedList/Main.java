package LinkedList;

public class Main {

	public static void main(String[] args) {
//		intLinkedList l = new intLinkedList(20);
//		l.insertS(5);
//		l.insertS(21);
//		l.insertS(111);
//		l.insertL(32);
//		l.display();
////		l.display();
//		System.out.println();
//		System.out.println(l.delete(11));
//		l.display();
//		System.out.println(l.contains(40));
//		l.bSort();
//		System.out.println();
//		l.display();
//using personLinkedList
//		person p1=new person("Junaid",21);
//		person p2=new person("unaid",2);
//		person p3=new person("naid",3);
//		person p4=new person("aid",4);
//		
//		personLinkedList p = new personLinkedList(p1);
//		p.insertL(p2);
//		p.insertL(p3);
//		p.insertL(p4);
//		p.display();
//		System.out.println();
//		p.delete("Junaid");
//		p.display();
	
		dLinkedList d = new dLinkedList(21);
		d.insertL(12);
		d.insertL(1);
		d.insertS(19);
		d.insertS(234);
		d.display();
		d.delete(12);
		System.out.println();
		d.display();
		d.delete(234);
		System.out.println();
		d.display();
	}

}
