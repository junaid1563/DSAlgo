package stack;

public class personStack {
	private person[] stack;
	private int size;
	private int top;

//defaultConstructor()
	public personStack() {
		this.top = -1;
		this.size = 100;
		stack = new person[this.size];
	}

	// customConstructor()
	public personStack(int size) {
		this.top = -1;
		this.size = size;
		stack = new person[this.size];
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
	public boolean push(person item) {
		if (!isFull()) {
			stack[++top] = item;
			return true;
		} else {
			return false;
		}
	}

	// pop()
	public person pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return null;
		}

	}

	public void display() {
		System.out.print("[ ");
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i].toString()+ " ");
		}
		System.out.print("]");
	}
}
