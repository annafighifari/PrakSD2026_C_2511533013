package pekan4_2511533013;

public class QueueArray_2511533013 {
    int front_3013, rear_3013, size_3013;
    int capacity_3013;
    int array[];

    public QueueArray_2511533013(int capacity) {
        this.capacity_3013 = capacity;
        this.front_3013 = this.size_3013 = 0;
        this.rear_3013 = capacity - 1;
        this.array = new int[this.capacity_3013];
    }

    boolean isFull_3013 (QueueArray_2511533013 queue) {
        return (queue.size_3013 == queue.capacity_3013);
    }

    boolean isEmpty_3013 (QueueArray_2511533013 queue) {
        return (queue.size_3013 == 0);
    }

    void enqueue_3013 (int item) {
        if (isFull_3013(this))
            return;
        this.rear_3013 = (this.rear_3013 + 1) % this.capacity_3013;
        this.array[rear_3013] = item;
        this.size_3013 = this.size_3013 + 1;
        System.out.println(item + " enqueued to queue");
    }

    int dequeue_3013() {
        if (isEmpty_3013(this))
            return Integer.MIN_VALUE;
        int item = this.array[this.front_3013];
        this.front_3013 = (this.front_3013 + 1) % this.capacity_3013;
        this.size_3013 = this.size_3013 - 1;
        return item;
    }
    int front_3013() {
        if (isEmpty_3013(this))
            return Integer.MIN_VALUE;
        return this.array[this.front_3013];
    }
    int rear_3013() {
        if (isEmpty_3013(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear_3013];
    }
    // mencetak elemen antrian
    void display_3013() {
        int i;
        if (front_3013 == rear_3013) {
            System.out.println("\nAntrian kosong");
            return;
        }
        // kunjungi dari belakang dan cetak
        for (i = front_3013; i < rear_3013; i++) {
            System.out.printf(" %d <-- ", array[i]);
        }
        return;
    }
}
