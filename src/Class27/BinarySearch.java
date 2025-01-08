package Class27;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = null;
        right = null;
    }
}

public class BinarySearch {
    Node root;

    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);  // Traverse left subtree
            System.out.print(" " + node.key);  // Visit node
            traverseTree(node.right);  // Traverse right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearch t = new BinarySearch();
        t.root = new Node(1); // Root node
        t.root.left = new Node(2); // Left child of root
        t.root.right = new Node(3); // Right child of root
        t.root.left.left = new Node(4); // Left child of node 2
        t.root.right.right = new Node(5); // Right child of node 3

        System.out.println("In-order traversal of the binary tree:");
        t.traverseTree(t.root); // Call the traversal method
    }
}
