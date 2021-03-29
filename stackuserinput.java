package stackimplementation;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum  size of your stack");
		int size = sc.nextInt();int x;
		Stack stack = new Stack(size);
		while(true) {
			System.out.println("\nPress 1 for pushing onto stack\nPress 2 to pop from Stack\nPress 3 to get current size of stack\nPress 4 to display the stack");
			x = sc.nextInt();
			switch(x)
			{
			case 1: System.out.println("Enter element");
					stack.push(sc.nextInt());
					break;
			case 2: stack.pop();
					break;
			case 3: stack.getSize();
					break;
			case 4: stack.display();
					break;
			default:System.out.println("Invalid Choice");
					System.exit(0);
			
			}
    }
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
		      //System.exit(1);
		    }
		System.out.println("Removing "+arr[top]);
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
		      //System.exit(1);
		    }
		    System.out.println("Inserting " + x);
		    arr[++top] = x;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity - 1;
	}
	
	

}
