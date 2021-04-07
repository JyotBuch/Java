package treetraversalprogram;


public class treetraversal {
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

	public void traverseInOrder(Node current) {
		
		if (current != null) {
			traverseInOrder(current.leftChild);
			System.out.print(" " + current.data);
			traverseInOrder(current.rightChild);
		}
	}
	
	public void traversePreOrder(Node node) {
		
	    if (node != null) {
	        System.out.print(" " + node.data);
	        traversePreOrder(node.leftChild);
	        traversePreOrder(node.rightChild);
	    }
	}
	
	public void traversePostOrder(Node node) {
		
	    if (node != null) {
	        traversePostOrder(node.leftChild);
	        traversePostOrder(node.rightChild);
	        System.out.print(" " + node.data);
	    }
	}

	public static void main(String args[]) {
		treetraversal tree = new treetraversal();
		Node root = new Node(7);
		tree.insert(root, 8);
		tree.insert(root, 3);
		tree.insert(root, 7);
		tree.insert(root, 6);
		tree.insert(root, 9);
		tree.insert(root, 12);
		tree.insert(root, 13);
		System.out.println("In-Order  Traversal Left-Root-Right");
		tree.traverseInOrder(root);
		System.out.println("\nPre-Order Traversal Left-Root-Right");
		tree.traversePreOrder(root);
		System.out.println("\nPost-Order Traversal Right-Left-Root");
		tree.traversePostOrder(root);

	}
}
