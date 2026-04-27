package pekan4_2511533013;

public class QueueArrayDriver_2511533013 {
    public static void main(String[] args) {
        QueueArray_2511533013 queue = new QueueArray_2511533013(1000);
        queue.enqueue_3013(10);
        queue.enqueue_3013(20);
        queue.enqueue_3013(30);
        queue.enqueue_3013(40);
        System.out.println("Item di depan: " + queue.front_3013());
        System.out.println("Item paling belakang: " + queue.rear_3013());
        System.out.println("tampilkan queue: ");
        queue.display_3013();
        System.out.println();
        System.out.println(queue.dequeue_3013() + " dihapuskan dari queue");
        System.out.println("Item di depan: " + queue.front_3013());
        System.out.println("Item paling belakang: " + queue.rear_3013());
        System.out.println("tampilkan queue setelah satu data dihapus: ");
        queue.display_3013();
    }

}
