package stack;

public class intStack {
	private int[] stack;
	private int size;
	private int top;

//defaultConstructor()
	public intStack() {
		this.top = -1;
		this.size = 100;
		stack = new int[this.size];
	}

	// customConstructor()
	public intStack(int size) {
		this.top = -1;
		this.size = size;
		stack = new int[this.size];
	}

//isFull()
	public boolean isFull() {
		return top == size - 1;
	}

	// isEmpty()
	public boolean isEmpty() {
		return this.top == -1;
	}

	// push()
	public boolean push(int item) {
		if (!isFull()) {
			stack[++top] = item;
			return true;
		} else {
			return false;
		}
	}

	// pop()
	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return -1;
		}
	}

	public void display() {
		System.out.print("[ ");
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.print("]");
	}
}
