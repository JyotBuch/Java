public class findingnthelementintree {

    static class Node {
		int data;
		Node leftChild, rightChild;

		Node(int data) {
			this.data = data;
			leftChild = null;
			rightChild = null;
		}
	}

	public void insert(Node current, int value) {
		if (value < current.data) {
			if (current.leftChild != null) {
				insert(current.leftChild, value);
			} else {
				System.out.println("Inserted left to "+current.data+" value "+value+"\n");
				current.leftChild = new Node(value);
			}
		} else if (value > current.data)

		{
			if (current.rightChild != null) {
				insert(current.rightChild, value);
			} else {
				System.out.println("Inserted right to "+current.data+" value "+value+"\n");
				current.rightChild = new Node(value);
			}
		}
	}

    public Node search(Node current, int value) {
        if(value<=current.data){
            while(current.data!=value)
            {
                current=search(current.leftChild,value);
            }
        }
        else if(value>=current.data){
            while(current.data!=value)
            {
                current=search(current.rightChild,value);
            }
        }
        /*if(current.data==value)
            System.out.println(current.data+" Found");
        else
            System.out.println(current.data+" not found");*/
        return current;
    }

    public static void main(String[] args){
        findingnthelementintree  tree = new findingnthelementintree ();
		Node root = new Node(7);
		tree.insert(root, 8);
		tree.insert(root, 3);
		tree.insert(root, 7);
		tree.insert(root, 6);
		tree.insert(root, 9);
		tree.insert(root, 12);
		tree.insert(root, 13);
        Node check=tree.search(root,9);
        if(check.data==9)
            System.out.println("Element Found");
        else
            System.out.println("Element not Found");
    }
}
