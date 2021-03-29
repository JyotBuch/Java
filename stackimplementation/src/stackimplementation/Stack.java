package stackimplementation;

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top=-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.getSize();
		stack.display();
	}
	
	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<top+1;i++)
			System.out.print(arr[i]+" ");
	}

	private void getSize() {
		// TODO Auto-generated method stub
		System.out.println("Size of stack is "+(top+1));
	}

	private int pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
		      System.out.println("STACK EMPTY");
		      System.exit(1);
		    }
		    return arr[top--];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	private void push(int x) {
		// TODO Auto-generated method stub
		if (isFull()) {
		      System.out.println("Stack OverFlow");
		      System.exit(1);
		    }
		    System.out.println("Inserting " + x);
		    arr[++top] = x;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity - 1;
	}
	
	

}
