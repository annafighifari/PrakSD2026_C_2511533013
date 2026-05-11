package pekan6_2511533013;

public class NodeDLL_2511533013 {
    // mendefinisikan kelas node
    int data; //data
    NodeDLL_2511533013 next; //pointer ke node berikutnya
    NodeDLL_2511533013 prev; //pointer ke node sebelumnya

    // konstruktor
    public NodeDLL_2511533013(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}