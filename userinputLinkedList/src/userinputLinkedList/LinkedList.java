package userinputLinkedList;

public class LinkedList 
{
    Node head;

    public void insert(int quantity) 
    {        
        		Node newNode = new Node(quantity);
				if(head == null) 
				{
				    head = newNode;
				}
				else 
				{
				    Node n = head;
				    while(n.next != null) 
				    {
				        n = n.next;
				    }
				    n.next = newNode;
				}
				
    }

	public void display() {
		// TODO Auto-generated method stub
		 Node currentNode = head;
	        if(currentNode == null)
	        {
	            System.out.println("Linked list is empty");
	        }
	        else 
	        {
	        	while(currentNode != null)
	        	{
	        		System.out.print(currentNode.quantity + "->");
	                currentNode = currentNode.next;
	        	}
	        	System.out.println();
	        }
	}

	public void displayhead() {
		// TODO Auto-generated method stub
		Node currentNode = head;
        if(currentNode == null)
        {
            System.out.println("Linked list is empty");
        }
        else 
        	System.out.println("\nHead is :"+currentNode.quantity+"");
	}

	public void deleteLast() {
		// TODO Auto-generated method stub
		Node currentNode = head;
        if(currentNode == null)
        {
            System.out.println("Linked list is empty");
        }
        else {
        	while(currentNode.next.next!=null) {
        		currentNode = currentNode.next;
        	}
        	System.out.println("\nDeleted element : "+currentNode.next.quantity);
        	currentNode.next=null;
        }
	}

	public void deleteFirst() {
		// TODO Auto-generated method stub
		Node currentNode = head;
        if(currentNode == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        	{
        		System.out.println("\nDeleted Element : "+currentNode.quantity);
        		head= currentNode.next;
        	}
	}

	public void deleteNode(int i) {
		// TODO Auto-generated method stub
		 Node currentNode = head;
	        if(currentNode == null)
	        {
	            System.out.println("Linked list is empty");
	        }
	        else 
	        {
	        	while(currentNode.next.quantity != i)
	        	{
	                currentNode = currentNode.next;
	        	}
	        	System.out.println("\nDeleted element :"+currentNode.next.quantity);
	        	currentNode.next=currentNode.next.next;
	        }
		
	}
}
