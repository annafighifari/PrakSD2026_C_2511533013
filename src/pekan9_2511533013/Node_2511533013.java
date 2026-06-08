package pekan9_2511533013;

public class Node_2511533013 {

    int data_3013;
    Node_2511533013 left;
    Node_2511533013 right;

    // Constructor
    public Node_2511533013(int data_3013) {
        this.data_3013 = data_3013;
        this.left = null;
        this.right = null;
    }

    // Setter left
    public void setLeft(Node_2511533013 node_3013) {
        if (left == null) {
            left = node_3013;
        }
    }

    // Setter right
    public void setRight(Node_2511533013 node_3013) {
        if (right == null) {
            right = node_3013;
        }
    }

    // Getter left
    public Node_2511533013 getLeft() {
        return left;
    }

    // Getter right
    public Node_2511533013 getRight() {
        return right;
    }

    // Getter data
    public int getData() {
        return data_3013;
    }

    // Setter data
    public void setData(int data_3013) {
        this.data_3013 = data_3013;
    }

    // Preorder Traversal
    void printPreorder(Node_2511533013 node_3013) {
        if (node_3013 != null) {
            System.out.print(node_3013.data_3013 + " ");
            printPreorder(node_3013.left);
            printPreorder(node_3013.right);
        }
    }

    // Postorder Traversal
    void printPostorder(Node_2511533013 node_3013) {
        if (node_3013 != null) {
            printPostorder(node_3013.left);
            printPostorder(node_3013.right);
            System.out.print(node_3013.data_3013 + " ");
        }
    }

    // Inorder Traversal
    void printInorder(Node_2511533013 node_3013) {
        if (node_3013 != null) {
            printInorder(node_3013.left);
            System.out.print(node_3013.data_3013 + " ");
            printInorder(node_3013.right);
        }
    }

    // Print Tree
    public String print() {
        return this.print("", true, "");
    }

    public String print(String prefix, boolean isTail, String sb) {

        if (right != null) {
            right.print(prefix + (isTail ? "    " : "│   "), false, sb);
        }

        System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data_3013);

        if (left != null) {
            left.print(prefix + (isTail ? "    " : "│   "), true, sb);
        }

        return sb;
    }
}