package pekan6_2511533013;

public class InsertDLL_2511533013 {
    // menambahkan node di awal DLL
    static NodeDLL_2511533013 insertBegin(NodeDLL_2511533013 head_3013, int data_3013) {
        // buat node baru
        NodeDLL_2511533013 new_node = new NodeDLL_2511533013(data_3013);
        // jadikan pointer next head
        new_node.next = head_3013;
        // jadikan pointer prev head ke new_node
        if (head_3013 != null) {
            head_3013.prev = new_node;
        }
        // kembalikan pointer ke node baru
        return new_node;
    }
    // fungsi mmenambahkan node di akhir
    public static NodeDLL_2511533013 insertEnd(NodeDLL_2511533013 head_3013, int newData_3013) {
        // buat node baru
        NodeDLL_2511533013 new_node = new NodeDLL_2511533013(newData_3013);
        // jika dll null dijadikan head
        if(head_3013 == null) {
            head_3013 = new_node;
        }
        else {
            NodeDLL_2511533013 curr = head_3013;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
            new_node.prev = curr;
        }
        return head_3013;
    }
    // fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511533013 insertAtPosition_3013(NodeDLL_2511533013 head_3013, int position_3013, int new_data_3013) {
        // buat node baru
        NodeDLL_2511533013 new_node = new NodeDLL_2511533013(new_data_3013);
        if (position_3013 == 1) {
            new_node.next = head_3013;
            if (head_3013 != null) {
                head_3013.prev = new_node; }
                head_3013 = new_node;
                return head_3013; }
                NodeDLL_2511533013 curr = head_3013;
                for (int i = 1; i < position_3013 - 1 && curr != null; ++i) {
                    curr = curr.next;
                if (curr == null) {
                    System.out.println("Posisi tidak ada");
                    return head_3013; }
                new_node.prev = curr;
                new_node.next = curr.next;
                curr.next = new_node;
                if (new_node.next != null) {
                    new_node.next.prev = new_node; }
                return head_3013; }
				return curr;
    }
    public static void printList(NodeDLL_2511533013 head_3013) {
        NodeDLL_2511533013 curr = head_3013;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // membuat dll 2 <-> 3 <-> 5
        NodeDLL_2511533013 head_3013 = new NodeDLL_2511533013(2);
        head_3013.next = new NodeDLL_2511533013(3);
        head_3013.next.prev = head_3013;
        head_3013.next.next = new NodeDLL_2511533013(5);
        head_3013.next.next.prev = head_3013.next;
        // cetak dll awal
        System.out.println("DLL awal:");
        printList(head_3013);
        // tambah 1 di awal
        head_3013 = insertBegin(head_3013, 1);
        System.out.println("Setelah menambahkan 1 di awal:");
        printList(head_3013);
        // tambah 6 di akhir
        System.out.println("Simpul 6 ditambah di akhir:");
        head_3013 = insertEnd(head_3013, 6);
        printList(head_3013);
        // menambah node 4 di posisi 4
        System.out.println("tambah node 4 di posisi 4:");
        head_3013 = insertAtPosition_3013(head_3013, 4, 4);
        printList(head_3013);   
    }
}