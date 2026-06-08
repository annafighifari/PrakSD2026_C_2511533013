package pekan9_2511533013;

public class BtreeDriver_2511533013 {

    public static void main(String[] args) {

        BTree_2511533013 tree_3013 = new BTree_2511533013();

        System.out.println("Jumlah simpul awal pohon: "
                + tree_3013.countNodes());

        // Membuat root
        Node_2511533013 root =
                new Node_2511533013(1);

        tree_3013.setRoot(root);

        System.out.println("Jumlah simpul setelah root ditambahkan: "
                + tree_3013.countNodes());

        // Membuat node
        Node_2511533013 node2 =
                new Node_2511533013(2);

        Node_2511533013 node3 =
                new Node_2511533013(3);

        Node_2511533013 node4 =
                new Node_2511533013(4);

        Node_2511533013 node5 =
                new Node_2511533013(5);

        Node_2511533013 node6 =
                new Node_2511533013(6);

        Node_2511533013 node7 =
                new Node_2511533013(7);

        Node_2511533013 node8 =
                new Node_2511533013(8);

        Node_2511533013 node9 =
                new Node_2511533013(9);

        // Membentuk tree
        root.setLeft(node2);
        root.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        node4.setLeft(node8);

        node6.setLeft(node9);

        // Set current
        tree_3013.setCurrent(tree_3013.getRoot());

        System.out.println("Menampilkan simpul current:");
        System.out.println(
                tree_3013.getCurrent().getData());

        System.out.println("Jumlah simpul setelah semua node ditambahkan:");
        System.out.println(tree_3013.countNodes());

        // Traversal
        System.out.println("InOrder:");
        tree_3013.inOrder();

        System.out.println("\nPreOrder:");
        tree_3013.preOrder();

        System.out.println("\nPostOrder:");
        tree_3013.postOrder();

        // Print tree
        System.out.println("\nMenampilkan simpul dalam bentuk pohon:");
        tree_3013.print();
    }
}