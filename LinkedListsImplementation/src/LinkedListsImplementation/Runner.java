package LinkedListsImplementation;

public class Runner 
{

	public static void main(String[] args)
	{
        LinkedList list = new LinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        list.displayhead();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.display();
        list.displayhead();
        list.deleteNode(5);
        list.display();
	}
}



