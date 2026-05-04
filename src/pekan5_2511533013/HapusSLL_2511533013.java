package pekan5_2511533013;

public class HapusSLL_2511533013 {

    // class node
    static class NodeSLL_2511533013 {
        int data;
        NodeSLL_2511533013 next;

        NodeSLL_2511533013(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // fungsi untuk menambah di depan
    public static NodeSLL_2511533013 insertAtFront(NodeSLL_2511533013 head_3013, int data_3013) {
        NodeSLL_2511533013 newNode = new NodeSLL_2511533013(data_3013);
        newNode.next = head_3013;
        return newNode;
    }

    // fungsi untuk menghapus head
    public static NodeSLL_2511533013 deleteHead(NodeSLL_2511533013 head_3013) {
        if (head_3013 == null)
            return null;

        head_3013 = head_3013.next;
        return head_3013;
    }

    // fungsi menghapus node terakhir
    public static NodeSLL_2511533013 removeLastNode(NodeSLL_2511533013 head_3013) {
        if (head_3013 == null)
            return null;

        if (head_3013.next == null)
            return null;

        NodeSLL_2511533013 secondLast = head_3013;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        return head_3013;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533013 deleteNode(NodeSLL_2511533013 head_3013, int position_3013) {
        NodeSLL_2511533013 temp = head_3013;
        NodeSLL_2511533013 prev = null;

        if (temp == null)
            return head_3013;

        if (position_3013 == 1) {
            return temp.next;
        }

        for (int i = 1; temp != null && i < position_3013; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            prev.next = temp.next;
        } else {
            System.out.println("Data tidak ada");
        }

        return head_3013;
    }

    // fungsi mencetak list
    public static void printList(NodeSLL_2511533013 head_3013) {
        if (head_3013 == null) {
            System.out.println("List kosong");
            return;
        }

        NodeSLL_2511533013 curr = head_3013;
        while (curr.next != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print(curr.data);
        System.out.println();
    }
    // kelas main
public static void main(String[] args) {
    // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    NodeSLL_2511533013 head_3013 = new NodeSLL_2511533013(1);
    head_3013.next = new NodeSLL_2511533013(2);
    head_3013.next.next = new NodeSLL_2511533013(3);
    head_3013.next.next.next = new NodeSLL_2511533013(4);
    head_3013.next.next.next.next = new NodeSLL_2511533013(5);
    head_3013.next.next.next.next.next = new NodeSLL_2511533013(6);

    // cetak list awal
    System.out.println("list awal: ");
    printList(head_3013);

    // hapus head
    head_3013 = deleteHead(head_3013);
    System.out.println("List setelah head dihapus: ");
    printList(head_3013);

    // hapus node terakhir
    head_3013 = removeLastNode(head_3013);
    System.out.println("List setelah simpul terakhir di hapus: ");
    printList(head_3013);

    // Deleting node at position 2
    int position_3013 = 2;
    head_3013 = deleteNode(head_3013, position_3013);

    // Print list after deletion
    System.out.println("List setelah posisi 2 dihapus: ");
    printList(head_3013);
}
}