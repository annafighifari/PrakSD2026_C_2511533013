package pekan6_2511533013;

public class PenelusuranDLL_2511533013 {
    // fungsi penulusuran maju
    static void forwardTraversal(NodeDLL_2511533013 head_3013) {
        // memulai penelusuran dari head
        NodeDLL_2511533013 curr = head_3013;
        // lanjutkan sampai akhir
        while (curr != null) {
            // print data
            System.out.println(curr.data + " <->");
            // pindah ke node berikutnya
            curr = curr.next; 
        }
        // print spasi
        System.out.println();
    }
        // fungsi penelusuran mundur
        static void backwardTraversal(NodeDLL_2511533013 tail_3013) {
            // mulai dari akhir
            NodeDLL_2511533013 curr = tail_3013;
            // lanjutkan sampai head
            while (curr != null) {
                // print data
                System.out.println(curr.data + " <->");
                // pindah ke node sebelumnya
                curr = curr.prev; 
            }
            // print spasi
            System.out.println();
        }
        public static void main(String[] args) {
            // cetak DLL
            NodeDLL_2511533013 head_3013 = new NodeDLL_2511533013(1);
            NodeDLL_2511533013 second_3013 = new NodeDLL_2511533013(2);
            NodeDLL_2511533013 third_3013 = new NodeDLL_2511533013(3);

            head_3013.next = second_3013;
            second_3013.prev = head_3013;
            second_3013.next = third_3013;
            third_3013.prev = second_3013;

            System.out.println("Penelusuran maju:");
            forwardTraversal(head_3013);

            System.out.println("Penelusuran mundur:");
            backwardTraversal(third_3013);
        }
}
