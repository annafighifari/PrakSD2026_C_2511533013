package pekan6_2511533013;

public class HapusDLL_2511533013 {
    // fungsi menghapus node awal
    public static NodeDLL_2511533013 delHead_3013(NodeDLL_2511533013 head_3013)  {
        if (head_3013 == null) {
        	return null;
        }
        NodeDLL_2511533013 temp = head_3013;
        head_3013 = head_3013.next;
        if (head_3013 != null) {
        	head_3013.prev = null; }
        	return head_3013;
        }
        // fungsi menghapus di akhir
        public static NodeDLL_2511533013 delEnd_3013(NodeDLL_2511533013 head_3013) {
            if (head_3013 == null) {
                return null;
            }
            if (head_3013.next == null) {
                return null;
            }
            NodeDLL_2511533013 curr = head_3013;
            while (curr.next != null) {
                curr = curr.next;
            }
            // update pointer previous node
            if (curr.prev != null) {
                curr.prev.next = null; }
            return head_3013;
        
            }
        // fungsi menghapus node di posisi tertentu
public static NodeDLL_2511533013 delPos_3013(NodeDLL_2511533013 head_3013, int pos_3013) {

    // jika DLL kosong
    if (head_3013 == null) {
        return head_3013;
    }

    NodeDLL_2511533013 curr = head_3013;

    // telusuri sampai node yang akan dihapus
    for (int i = 1; curr != null && i < pos_3013; ++i) {
        curr = curr.next;
    }

    // jika posisi tidak ditemukan
    if (curr == null) {
        return head_3013;
    }

    // update pointer prev dan next
    if (curr.prev != null) {
        curr.prev.next = curr.next;
    }

    if (curr.next != null) {
        curr.next.prev = curr.prev;
    }

    // jika node yang dihapus adalah head
    if (head_3013 == curr) {
        head_3013 = curr.next;
    }

    return head_3013;
}

// fungsi mencetak DLL
public static void printList(NodeDLL_2511533013 head_3013) {

    NodeDLL_2511533013 curr = head_3013;

    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }

    System.out.println();
}
        public static void main(String[] args) {
            // buat sebuah DLL
            NodeDLL_2511533013 head_3013 = new NodeDLL_2511533013(1);
            head_3013.next = new NodeDLL_2511533013(2);
            head_3013.next.prev = head_3013;
            head_3013.next.next = new NodeDLL_2511533013(3);
            head_3013.next.next.prev = head_3013.next;
            head_3013.next.next.next = new NodeDLL_2511533013(4);
            head_3013.next.next.next.prev = head_3013.next.next;
            head_3013.next.next.next.next = new NodeDLL_2511533013(5);
            head_3013.next.next.next.next.prev = head_3013.next.next.next;
            
            System.out.println("DLL awal:");
            printList(head_3013);
            
            System.out.println("Setelah head dihapus:");
            head_3013 = delHead_3013(head_3013);
            printList(head_3013);
        
            System.out.println("Setelah node terakhir dihapus:");
            head_3013 = delEnd_3013(head_3013);
            printList(head_3013);

            System.out.println("menghapus node ke 2:");
            head_3013 = delPos_3013(head_3013, 2);
            printList(head_3013);
        }
        }
        
        
