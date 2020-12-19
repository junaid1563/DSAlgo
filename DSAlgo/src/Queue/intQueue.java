package Queue;

public class intQueue {
	private int[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;

//defaultconstructor()
	public intQueue() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[this.size];
	}

	// customconstructor()
	public intQueue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[this.size];
	}

	// isFull()
	public boolean isFull() {
		return total == size;
	}

	// enqueue()
	public boolean enqueue(int item) {
		if (!isFull()) {
			total++;
			queue[rear] = item;
			rear = (rear + 1) % size;
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
	public int dequeue() {
		if (!isEmpty()) {
			int temp = queue[front];
			front = (front + 1) % size;
			total--;
			return temp;
		} else {
			return Integer.MIN_VALUE;
		}
	}

//display()
	public void display() {
		if (total != 0) {
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}

	}

//getrf()---> to print rear and front values
	public void getrf() {
		System.out.println("rear: " + this.rear + " front: " + this.front);
	}
}
