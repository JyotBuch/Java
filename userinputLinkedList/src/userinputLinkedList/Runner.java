package userinputLinkedList;
import java.util.*;

public class Runner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;
        /*list.insert(1);
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
        list.display();*/
        while(true) {
        	System.out.println("\nPress 1 for inserting element\nPress 2 for deleting last element\nPress 3 for deleting first element\nPress 4 for displaying the head of the list\nPress 5 for displaying the list");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 1:System.out.println("Enter Data");
        	list.insert(sc.nextInt());
        	break;
        	case 2:list.deleteLast();
        	break;
        	case 3:list.deleteFirst();
        	break;
        	case 4:list.displayhead();
        	break;
        	case 5:list.display();
        	break;
        	default:System.out.println("Invalid Choice");
        	System.exit(0);;
        	}
        }
	}
}
