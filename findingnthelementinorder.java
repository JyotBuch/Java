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
        /*if(value<=current.data){
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

        //return current;
    }

   /* void NthInorder( Node node, int n) 
{  
    if (node == null) 
        return; 
    if (count <= n) { 
        NthInorder(node.leftChild, n); 
        count++; 
        if (count == n) 
            System.out.printf("%d ", node.data); 
        NthInorder(node.rightChild, n); 
    } 
} */

    

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
        /*Node check=tree.search(root,9);
        if(check.data==9)
            System.out.println("Element Found");
        else
            System.out.println("Element not Found");*/
        /*Node check=tree.NthInorder(root,9);
           if(check.data==9)
               System.out.println("Element Found");
           else
               System.out.println("Element not Found");*/
        tree.search(root,12);
    }
}
