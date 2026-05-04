package pekan5_2511533013;


public class PencarianSLL_2511533013 {
	static boolean searchKey_3013(NodeSLL_2511533013 head_3013, int key_3013) {
		NodeSLL_2511533013 curr_3013 = head_3013;
		while (curr_3013 != null) {
			if (curr_3013.data_3013 == key_3013) {
				return true;
			}
			curr_3013 = curr_3013.next_3013;
		}
		return false; }
		public static void traversal (NodeSLL_2511533013 head_3013) {
			// mulai dari head
			NodeSLL_2511533013 curr_3013 = head_3013;
			// telusuri hingga pointer null
			while (curr_3013 != null) {
				System.out.println(" " + curr_3013.data_3013);
				curr_3013 = curr_3013.next_3013; }
				System.out.println(); }
				public static void main (String[] args) {
					NodeSLL_2511533013 head_3013 = new NodeSLL_2511533013(14);
					head_3013.next_3013 = new NodeSLL_2511533013(21);
					head_3013.next_3013.next_3013 = new NodeSLL_2511533013(13);
					head_3013.next_3013.next_3013.next_3013 = new NodeSLL_2511533013(30);
					head_3013.next_3013.next_3013.next_3013.next_3013 = new NodeSLL_2511533013(10);
					System.out.println("Penelusuran SLL: ");
					traversal(head_3013);
				// data yang akan dicari
				int key_3013 = 30;
				System.out.println("cari data " + key_3013 + " = ");
				if (searchKey_3013(head_3013, key_3013))
					System.out.println("Data ditemukan");
				else
					System.out.println("Data tidak ditemukan");
				}
		}
