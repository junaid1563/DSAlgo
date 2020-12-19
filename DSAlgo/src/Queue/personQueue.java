package Queue;

public class personQueue {
	private person[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;

//defaultconstructor()
	public personQueue() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		queue = new person[this.size];
	}

	// customconstructor()
	public personQueue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = new person[this.size];
	}

	// isFull()
	public boolean isFull() {
		return total == size;
	}

	// enqueue()
	public boolean enqueue(person item) {
		if (!isFull()) {
			total++;
			queue[rear] = item;
			rear++;
			return true;
		} else {
			return false;
		}
	}

//isEmpty()
	public boolean isEmpty() {
		return total == 0;
	}

//dequeue
	public person dequeue() {

		person temp = queue[front++];
		total--;
		return temp;

	}
	//display
	public void display() {
		if (total != 0) {
			for (int i = front; i < rear%size; i++) {
				System.out.println(queue[i].toString());
			}
		}

	}

//getrf()---> to print rear and front values
	public void getrf() {
		System.out.println(">> rear: " + this.rear + " front: " + this.front);
	}
}
