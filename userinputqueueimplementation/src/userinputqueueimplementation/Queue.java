package userinputqueueimplementation;

import java.util.Scanner;

public class Queue {
	
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	
	public Queue(int i) {
		// TODO Auto-generated constructor stub
		arr= new int[i];
		front=-1;
		rear=-1;
		capacity=i;
	}
	
	private void displayQueue() {
		// TODO Auto-generated method stub
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" ");
	}

	private int deQueue() {
		// TODO Auto-generated method stub
		int element;
		if (isEmpty()) {
		      System.out.println("Queue Empty");
		      return -1;
		      //System.exit(1);
		    }
		else{
			element = arr[front];
		      if (front >= rear) {
		        front = -1;
		        rear = -1;
		      }
		else {
		    	front++;  
		      }
		      System.out.println("Removing item "+element);
		      return(element);
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==-1)
			return true;
		else
			return false;
	}

	private void enQueue(int i) {
		// TODO Auto-generated method stub
		if (isFull()) {
		      System.out.println("Queue OverFlow");
		      System.exit(1);
		    }
		else if(front==-1)
			front=0;
		rear++;
		arr[rear]=i;
		System.out.println("Added item "+i);
		
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		if (front == 0 && rear == capacity-1) {
		      return true;
		    }
		    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of queue");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		int x;
		while(true)
		{
			while(true) {
				System.out.println("\nPress 1 for Enqueuing\nPress 2 to dequeue from Queue\nPress 3 to display the Queue");
				x = sc.nextInt();
				switch(x)
				{
				case 1: System.out.println("Enter element");
						q.enQueue(sc.nextInt());
						break;
				case 2: q.deQueue();
						break;
				case 3: q.displayQueue();
						break;
				default:System.out.println("Invalid Choice");
						System.exit(0);
				
				}
		}
	}}
}


