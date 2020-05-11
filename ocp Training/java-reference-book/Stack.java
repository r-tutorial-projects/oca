class Stack {
	int[] stack;
	int currentIndex = -1;
	final int maxIndex;


	Stack(int size) {
		if(size > 0)
			stack = new int[size];
		else
			System.out.println("stack-size should be > 0");
		maxIndex = --size;
	}

	Stack push(int item) {
		if(currentIndex < maxIndex)
			stack[++currentIndex] = item;
		else
			System.out.println("Stack is full!");
		return this;
	}

	int pop() {
		if(currentIndex >= 0)
			return stack[currentIndex--];
		else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}
}

class StackDemo {
	public static void main(String... args) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.push(6);

		out(stack.pop());
		out(stack.pop());
		out(stack.pop());
		out(stack.pop());
		out(stack.pop());
		out(stack.pop());
	}

	static void out(int i) {
		System.out.println(i);
	}
}
