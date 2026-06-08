package pekan9_2511533013;

public class BTree_2511533013 {

    private Node_2511533013 root;
    private Node_2511533013 currentNode;

    // Constructor
    public BTree_2511533013() {
        root = null;
    }

    // Search data
    public boolean search(int data_3013) {
        return search(root, data_3013);
    }

    private boolean search(Node_2511533013 node_3013,
                           int data_3013) {

        // Jika node kosong
        if (node_3013 == null) {
            return false;
        }

        // Jika data ditemukan
        if (node_3013.getData() == data_3013) {
            return true;
        }

        // Cari ke kiri
        if (node_3013.getLeft() != null) {

            if (search(node_3013.getLeft(), data_3013)) {
                return true;
            }
        }

        // Cari ke kanan
        if (node_3013.getRight() != null) {

            if (search(node_3013.getRight(), data_3013)) {
                return true;
            }
        }

        return false;
    }

    // Traversal Inorder
    public void inOrder() {
        root.printInorder(root);
    }

    // Traversal Preorder
    public void preOrder() {
        root.printPreorder(root);
    }

    // Traversal Postorder
    public void postOrder() {
        root.printPostorder(root);
    }

    // Getter root
    public Node_2511533013 getRoot() {
        return root;
    }

    // Mengecek tree kosong
    public boolean isEmpty() {
        return root == null;
    }

    // Menghitung jumlah node
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node_2511533013 node_3013) {

        if (node_3013 == null) {
            return 0;
        }

        int count = 1;

        count += countNodes(node_3013.getLeft());

        count += countNodes(node_3013.getRight());

        return count;
    }

    // Menampilkan tree
    public void print() {
        root.print();
    }

    // Getter current node
    public Node_2511533013 getCurrent() {
        return currentNode;
    }

    // Setter current node
    public void setCurrent(Node_2511533013 node_3013) {
        this.currentNode = node_3013;
    }

    // Setter root
    public void setRoot(Node_2511533013 root) {
        this.root = root;
    }
}