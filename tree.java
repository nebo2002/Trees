class Node
{
    int data;
    Node left;
    Node right;
    
    public Node( int key)
    {
        data=key;
        left=right=null;
    }
}


public class Tree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        root.right.left=new Node(4);
        
        // printing the tree
        
        printTree(root);
    }
    
    public static void printTree(Node node)
    {
        if (node==null)
        {
            return;
        }
        
        System.out.print(node.data+"");
        
        printTree(node.left);
        
        printTree(node.right);
    }
}
