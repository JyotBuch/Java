package CircularLinkedList;


public class CircularList 
{
	 public Node head = null;  
	    public Node tail = null;  
	   
	    public void add(int data){ 
	        Node newNode = new Node(data);  
	        if(head == null) {  
	            head = newNode;  
	            tail = newNode;  
	            newNode.next = head;  
	        }  
	        else {   
	            tail.next = newNode;  
	            tail = newNode;  
	            tail.next = head;  
	        }  
	    }  
	    
	    public void deleteNode() {
	    	Node currentNode = head;
	    	if(currentNode == null)
	        {
	            System.out.println("Linked list is empty");
	        }
	        else
	        {
	        	while(currentNode.next.next!=head) 
	        		currentNode = currentNode.next;
	        }
	        	System.out.println("Deleted element : "+currentNode.next.data);
	        	currentNode.next=head;

	    }
	  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            System.out.println("Nodes of the circular linked list: ");  
	             do{    
	                System.out.print("-> "+ current.data);  
	                current = current.next;  
	            }while(current != head);  
	            System.out.println();  
	        }  
	    }  
}

