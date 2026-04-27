package pekan4_2511533013;

import java.util.Queue;
import java.util.LinkedList;
public class QueueLinkedList_2511533013 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // tambah elemen {0,1,2,3,4,5} ke dalam queue
        for (int i = 0; i <= 6; i++) {
            queue.add(i);
        }
        // Menampilkan Antrian
        System.out.println("Elemen Antrian" + queue);
        // hapus elemen dari queue
        int hapus = queue.remove();
        System.out.println("Hapus Elemen: " + hapus);
        System.out.println(queue);
        // tampilkan elemen di depan antrian
        int depan = queue.peek();
        System.out.println("Kepala Antrian: " + depan);

        int banyak = queue.size();
        System.out.println("Size Antrian: " + banyak);
        }
    }
