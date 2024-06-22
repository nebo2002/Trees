class Node {
    int data;
    Node left;
    Node right;
    
    // Constructor to initialize the node with a value
    public Node(int key) {
        data = key;
        left = right = null;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        // Create the root node
        Node root = new Node(1);
        
        // Create and attach the left and right children of the root
        root.left = new Node(2);
        root.right = new Node(3);
        
        // Create and attach the left child of the right child of the root
        root.right.left = new Node(4);

        // Print the tree
        printTree(root);
    }

    // Method to print the tree in pre-order traversal
    public static void printTree(Node node) {
        if (node == null) {
            return;
        }
        
        // Print the data of the node
        System.out.print(node.data + " ");
        
        // Recursively print the left subtree
        printTree(node.left);
        
        // Recursively print the right subtree
        printTree(node.right);
    }
}
