package StudentInfoLinkedList;

public class StudentList {

	Node head;

	public void insert(String name, double gpa) {
		// TODO Auto-generated method stub
		Node newNode = new Node(name, gpa);
		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}

	public void deleteLast() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode.next.next != null) {
				currentNode = currentNode.next;
			}
			System.out.println("\nDeleted Student : " + currentNode.next.name);
			currentNode.next = null;
		}
	}

	public void checkFirstClass() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode != null) {
				if (currentNode.gpa > 3)
					currentNode.firstclass = true;
				else
					currentNode.firstclass = false;
				if (currentNode.firstclass)
					System.out.print(currentNode.name + "\t" + currentNode.gpa + "\tPassed with First Class: "
							+ currentNode.firstclass + "\n");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}

	public void getHighest() {
		// TODO Auto-generated method stub
		double max = 0;
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode != null) {
				if (currentNode.gpa > max)
					max = currentNode.gpa;
				currentNode = currentNode.next;
				//System.out.println(max);
			}
			getMax(max);
			System.out.println();
		}

	}

	private void getMax(double max) {
		// TODO Auto-generated method stub
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.gpa == max)
				System.out.println("Highest Grade"+currentNode.name + "\t" + currentNode.gpa);
			currentNode = currentNode.next;
		}
	}

	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (!currentNode.next.name.equalsIgnoreCase(name)) {
				currentNode = currentNode.next;
			}
			System.out.println("\nDeleted Student :" + name);
			currentNode.next = currentNode.next.next;
		}

	}

	public void displayStudents() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode != null) {
				System.out.println(currentNode.name + "\t" + currentNode.gpa);
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}

	@SuppressWarnings("unused")
	public void getLowest() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		double min = currentNode.gpa;
		if (currentNode == null)
			System.out.println("Linked list is empty");
		else {
			while (currentNode != null) {
				if (currentNode.gpa < min)
					min = currentNode.gpa;
				currentNode = currentNode.next;
				//System.out.println(max);
			}
			getMin(min);
			System.out.println();
		}
	}

	private void getMin(double min) {
		// TODO Auto-generated method stub
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.gpa == min)
				System.out.println("Lowest Grade"+currentNode.name + "\t" + currentNode.gpa);
			currentNode = currentNode.next;
		}
	}
}
