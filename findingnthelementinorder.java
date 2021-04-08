public class findingnthelementinorder {
    static class Node {
		int data;
		Node leftChild, rightChild;

		Node(int data) {
			this.data = data;
			leftChild = null;
			rightChild = null;
		}
	}
    static int count =0;  

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

    void search(Node current, int value) {
              
    if (current == null) 
    return; 
    if(current!=null)
    {
        search(current.leftChild, value); 
        if(current.data==value){
            System.out.println(current.data+" Found");
        }
        search(current.rightChild, value);
    }
	    
    }

   

    public static void main(String[] args){
        findingnthelementinorder  tree = new findingnthelementinorder ();
		Node root = new Node(7);
		tree.insert(root, 8);
		tree.insert(root, 3);
		tree.insert(root, 7);
		tree.insert(root, 6);
		tree.insert(root, 9);
		tree.insert(root, 12);
		tree.insert(root, 13);
                tree.search(root,12);
    }
}
