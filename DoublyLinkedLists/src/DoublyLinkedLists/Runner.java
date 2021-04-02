package DoublyLinkedLists;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        list.deleteLast();
        list.display();
        list.deleteNode(3);
        list.display();
        list.displayReverse();
        list.display();
        list.deleteLast();
        list.display();
       // list.displayhead();
        //list.deleteLast();
       // list.display();
        //list.deleteFirst();
       // list.display();
        //list.displayhead();
       // list.deleteNode(5);
       // list.display();
	}

}
