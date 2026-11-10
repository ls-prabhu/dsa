class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraversal {

    // in order left root right
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


    // root left right
    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.right.left = new Node('E');
        root.right.right = new Node('F');
        root.right.left.right = new Node('G');
        root.right.right.left = new Node('H');
        root.right.right.right = new Node('I');
        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);
    }
}