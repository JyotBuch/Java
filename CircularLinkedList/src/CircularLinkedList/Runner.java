package CircularLinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList cl = new CircularList();
        
		cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        cl.display();
        cl.deleteNode();
        cl.display();
	}

}
