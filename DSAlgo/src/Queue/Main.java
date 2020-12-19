package Queue;

public class Main {

	public static void main(String[] args) {
//		intQueue q = new intQueue();
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(21);
//		q.enqueue(32);
//		q.display();
//		q.dequeue();
//		System.out.println();
//		q.display();
		person p1 = new person("junaid", 21);
		person p2 = new person("jackie", 22);
		person p3 = new person("jumba", 23);
		personQueue q = new personQueue();
		q.enqueue(p1);
		q.enqueue(p2);
		q.enqueue(p3);
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
	}

}
