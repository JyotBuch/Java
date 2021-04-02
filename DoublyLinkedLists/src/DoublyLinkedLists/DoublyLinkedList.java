package DoublyLinkedLists;

public class DoublyLinkedList {
	Node head, tail = null;  
	  
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }
        System.out.println();
	}
    
    public void deleteLast() {   
    	 if(head == null) {  
             return;  
         }  
         else {    
             if(head != tail) {  
            	 System.out.println("Deleted element "+tail.data);
                 tail = tail.previous;  
                 tail.next = null;  
                 System.out.println("New tail: "+tail.data);
             }  
             else {  
                 head = tail = null;  
             }  
         }  
	}
    
	public void insert(int i) {
		// TODO Auto-generated method stub
		Node newNode = new Node(i);  
		  
        if(head == null) {  
            head = tail = newNode;   
            head.previous = null;   
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
        }

	public void deleteNode(int i) {
		// TODO Auto-generated method stub
		 Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current.data != i) {    
	            current = current.next;  
	        }
	        System.out.println("Deleted element "+current.data);
	        if(current.next==null) {
	        	current.previous.next=null;
	            current.previous=null;
	        }
	        else {
	        	current.previous.next=current.next;
	        	current.next.previous=current.previous;
	        	current.previous=null;
	        	current.next=null;
	        }
	}

	public void displayReverse() {
		// TODO Auto-generated method stub
		 Node current = head, temp = null;  
		  
	        while(current != null) {  
	            temp = current.next;  
	            current.next = current.previous;  
	            current.previous = temp;  
	            current = current.previous;  
	        }  
	        temp = head;  
	        head = tail;  
	        tail = temp;  
	}
	}

