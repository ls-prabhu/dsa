class BinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    Node root;

    // Preorder Traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Postorder Traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        BinaryTree t = new BinaryTree();

        // Creating Binary Tree
        t.root = t.new Node(1);
        t.root.left = t.new Node(2);
        t.root.right = t.new Node(3);
        t.root.left.left = t.new Node(4);
        t.root.left.right = t.new Node(5);

        System.out.println("Preorder Traversal:");
        t.preorder(t.root);

        System.out.println("\nInorder Traversal:");
        t.inorder(t.root);

        System.out.println("\nPostorder Traversal:");
        t.postorder(t.root);
    }
}