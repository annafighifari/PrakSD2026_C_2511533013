package pekan5_2511533013;

public class TambahSLL_2511533013 {
public static NodeSLL_2511533013 insertAtFront(NodeSLL_2511533013 head, int value) {
	NodeSLL_2511533013 new_node = new NodeSLL_2511533013(value);
	new_node.next_3013 = head;
	return new_node;
	
}
//fungsi menambahkan node di akhir SLL
public static NodeSLL_2511533013 insertAtEnd(NodeSLL_2511533013 head, int value) {
	//buat sebuah node dengan sebuah nilai
	NodeSLL_2511533013 newNode = new NodeSLL_2511533013(value);
	//jika list kosong maka node jadi head
	if (head == null) {
		return newNode;
		
	}
	// simpan head ke variabel sementara
	NodeSLL_2511533013 last = head;
	//telusuri ke node akhir
	while (last.next_3013 != null) {
		last = last.next_3013;
		
	}
	//ubah pointer
	last.next_3013 = newNode;
	return head;
	
}
static NodeSLL_2511533013 GetNode(int data) {
	return new NodeSLL_2511533013(data);
	
}
static NodeSLL_2511533013 insertPos(NodeSLL_2511533013 headNode, int position, int value) {
	NodeSLL_2511533013 head = headNode;
	if(position < 1)
		System.out.print("invalid position");
	if(position == 1) {
		NodeSLL_2511533013 new_node = new NodeSLL_2511533013(value);
	new_node.next_3013 = head;
	return new_node;
} else {
	while (position-- != 0) {
		if(position == 1) {
			NodeSLL_2511533013 newNode = GetNode(value);
			newNode.next_3013 = headNode.next_3013;
			headNode.next_3013 = newNode;
			break;
		}
		headNode = headNode.next_3013;
	}
	if(position != 1)
		System.out.print("posisi di luar jangkauan");   }
	return head; }
	public static void printList(NodeSLL_2511533013 head) {
		NodeSLL_2511533013 curr = head;
		while (curr.next_3013 != null) {
			System.out.print(curr.data_3013+"-->");
			curr = curr.next_3013;
			
		}
		if(curr.next_3013==null) {
			System.out.print(curr.data_3013); }
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		//buat linked List 2->3->5->6
		NodeSLL_2511533013 head =new NodeSLL_2511533013(2);
		head.next_3013 = new NodeSLL_2511533013(3);
		head.next_3013.next_3013 = new NodeSLL_2511533013(5);
		head.next_3013.next_3013.next_3013 = new NodeSLL_2511533013(6);
		//cetak List Asli
		System.out.print("Senarai berantai awal");
		printList(head);
		//tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_3013 = 1;
		head = insertAtFront(head, data_3013);
		// cetak update list
		printList(head);
		//tambahkan node baru di belakang
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_3013 = 7;
		head = insertAtEnd(head, data2_3013);
		//cetak update list
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_3013 = 4;
		int pos=4;
		head = insertPos(head,pos,data3_3013);
		//cetak update list
		printList(head);
		
		
	}

}