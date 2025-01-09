package Class28;

class AVLTree {
    // Node class representing each node of the tree
    static class Node {
        int data;
        Node left, right;
        int height;

        public Node(int item) {
            data = item;
            left = right = null;
            height = 1;
        }
    }

    private Node root;

    // Get height of a node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor of a node
    private int getBalanceFactor(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate subtree rooted with y
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Insert a node into the AVL tree
    public void insert(int data) {
        root = insert(root, data);
    }

    // Recursive insert function
    private Node insert(Node node, int data) {
        // Perform the normal BST insert
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            // Duplicate values are not allowed
            return node;
        }

        // Update the height of this ancestor node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get the balance factor
        int balance = getBalanceFactor(node);

        // If the node becomes unbalanced, then there are 4 cases

        // Left-Left Case
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Right-Right Case
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Left-Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder traversal (left, root, right)
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Preorder traversal (root, left, right)
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder traversal (left, right, root)
    public void postorder() {
        postorder(root);
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Main method to test the AVL tree
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Inserting nodes
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);
        tree.insert(5);

        // Printing the traversals
        System.out.println("Inorder traversal:");
        tree.inorder();  // Sorted order
        System.out.println("\nPreorder traversal:");
        tree.preorder();
        System.out.println("\nPostorder traversal:");
        tree.postorder();
    }
}
