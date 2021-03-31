package circularQueueImplementation;

public class CircularQueue {

	private int arr[];
	private int front;
	private int rear;
	private int capacity;

	public CircularQueue(int i) {
		// TODO Auto-generated constructor stub
		arr = new int[i];
		front = -1;
		rear = -1;
		capacity = i;
	}

	public static void main(String[] args) {

		CircularQueue q = new CircularQueue(5);

		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);

		q.display();

		q.deQueue();

		q.display();

		q.enQueue(7);

		q.deQueue();

		q.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Queue Empty");
		} else {
			System.out.println("Front of Queue is " + arr[front]);
			for (int i = front; i != rear; i = (i + 1) % capacity) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[rear] + " ");
		}
	}

	private void enQueue(int i) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Stack Full");
			System.exit(0);
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % capacity;
			arr[rear] = i;
			System.out.println("Inserted :" + i);
		}
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		if (front == 0 && rear == capacity - 1)
			return true;
		if (front == rear + 1)
			return true;
		else
			return false;
	}

	private int deQueue() {
		// TODO Auto-generated method stub
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
			return -1;
		} else {
			element = arr[front];
			front = (front + 1) % capacity;
			System.out.println("Removed " + element);
			return element;
		}

	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		if (front == -1)
			return true;
		else
			return false;
	}
}
